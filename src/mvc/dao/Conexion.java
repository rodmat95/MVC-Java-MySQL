/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.DriverManager;


/**
 *
 * @author Rodmat95
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/mvc";
    private static final String usuario = "root";
    private static final String contra = "";
    
    
    //objeto conexion
    
    private static Connection conexion;
    
    private Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(URL,usuario,contra);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("ERROR AL CONECTAR CON MYSQL");
        }
    }   
    
    //metodo publico para obtener la instancia 
    
    public static Connection obtenerConexion(){
        if(conexion == null){
            new Conexion();
        }
        return conexion;
    }
    public static void cerrarConexion(){
        if(conexion == null){
            try {
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } 
}