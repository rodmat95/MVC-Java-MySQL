/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.dao;

import java.util.List;
import mvc.model.Vehiculo;

/**
 *
 * @author Rodmat95
 */
public interface VehiculoDAO {
    //Listado de vehiculos
    
    public List<Vehiculo> ListarVehiculos();
}