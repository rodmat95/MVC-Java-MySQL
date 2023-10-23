/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.dao.impl;


import java.util.List;
import mvc.model.Vehiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mvc.dao.Conexion;
import mvc.dao.VehiculoDAO;

/**
 *
 * @author Rodmat95
 */
public class VehiculoDAOimpl implements VehiculoDAO {

    private PreparedStatement statement = null;
    private Connection conexion;
    
    public VehiculoDAOimpl(){
        this.conexion = Conexion.obtenerConexion();
    }

    @Override
    public List<Vehiculo> ListarVehiculos() {
        
        List<Vehiculo> listaVeiculo = new ArrayList<>();

        try {
            String consulta = "select * from vehiculos";
            statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String placa = resultSet.getString("placa");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                int anio = resultSet.getInt("anio");
                String color = resultSet.getString("color");
                
                //Llenar valor 
                
                Vehiculo veic = new Vehiculo();
                veic.setId(id);
                veic.setPlaca(placa);
                veic.setMarca(marca);
                veic.setModelo(modelo);
                veic.setAnio(anio);
                veic.setColor(color);
                listaVeiculo.add(veic);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaVeiculo;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        try {
            String consulta = "INSERT INTO vehiculos (placa, marca, modelo, anio, color) VALUES (?, ?, ?, ?, ?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, vehiculo.getPlaca());
            statement.setString(2, vehiculo.getMarca());
            statement.setString(3, vehiculo.getModelo());
            statement.setInt(4, vehiculo.getAnio());
            statement.setString(5, vehiculo.getColor());
        
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void modificarVehiculo(Vehiculo vehiculo) {
        try {
            String consulta = "UPDATE vehiculos SET placa=?, marca=?, modelo=?, anio=?, color=? WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, vehiculo.getPlaca());
            statement.setString(2, vehiculo.getMarca());
            statement.setString(3, vehiculo.getModelo());
            statement.setInt(4, vehiculo.getAnio());
            statement.setString(5, vehiculo.getColor());
            statement.setInt(6, vehiculo.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarVehiculo(int id) {
        try {
            String consulta = "DELETE FROM vehiculos WHERE id=?";
            statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}