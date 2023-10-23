/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;
import mvc.controller.VehiculoController;

/**
 *
 * @author Rodmat95
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoController controller =new VehiculoController();
        controller.contarVehiculos();
        controller.listarVehiculos();
    }
}