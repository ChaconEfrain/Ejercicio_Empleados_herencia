/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_empleados;

/**
 *
 * @author Dell
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados comercial1 = new Comercial(500, "Efraín", 31, 1000);
        Empleados repartidor1 = new Repartidor("Zona 3", "Joel", 24, 1000);
        
        comercial1.plus();
        repartidor1.plus();
        
        System.out.println(comercial1);
        System.out.println(repartidor1);
    }
    
}
