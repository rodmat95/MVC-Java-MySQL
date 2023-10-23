/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.controller;

import java.util.List;
import mvc.dao.impl.VehiculoDAOimpl;
import mvc.model.Vehiculo;

/**
 *
 * @author Rodmat95
 */
public class VehiculoController {
    
    private VehiculoDAOimpl vehiculoDAOimpl = null;
    
    public VehiculoController(){
        vehiculoDAOimpl = new  VehiculoDAOimpl();
    }
    
    public List<Vehiculo> contarVehiculos(){
        List<Vehiculo> contarVehiculo = null;
        contarVehiculo = vehiculoDAOimpl.ListarVehiculos();
        
        System.out.println(contarVehiculo.size());
        return contarVehiculo;
    }
    
    public List<Vehiculo> listarVehiculos(){
        List<Vehiculo> listaVehiculo = null;
        listaVehiculo = vehiculoDAOimpl.ListarVehiculos();
        
        for (Vehiculo vehiculos : listaVehiculo) {
            System.out.println("ID: " + vehiculos.getId() 
                    + ", Placa: " + vehiculos.getPlaca() 
                    + ", Marca: " + vehiculos.getMarca() 
                    + ", Modelo: " + vehiculos.getModelo() 
                    + ", Anio: " + vehiculos.getAnio() 
                    + ", Color: " + vehiculos.getColor());
        }
        return listaVehiculo;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculoDAOimpl.agregarVehiculo(vehiculo);
    }
    
    public void modificarVehiculo(Vehiculo vehiculo) {
        vehiculoDAOimpl.modificarVehiculo(vehiculo);
    }
    
    public void eliminarVehiculo(int id) {
        vehiculoDAOimpl.eliminarVehiculo(id);
    }

    public void listarvehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}