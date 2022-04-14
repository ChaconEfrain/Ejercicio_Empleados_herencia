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
public class Repartidor extends Empleados {
    //Atributos
    private String zona;
    
    //Constructor
    public Repartidor(String zona, String nombre, int edad, double salario){
        super(nombre, edad, salario);
        this.zona = zona;
    }
    //Métodos
    public String getZona(){
        return zona;
    }
    public void setZona(){
        this.zona = zona;
    }
    @Override
    public String toString(){
        return super.toString()+"Zona: "+this.zona;
    }
    @Override
    public boolean plus(){
        if(super.getEdad()<25 && this.zona.equalsIgnoreCase("zona 3")){
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadió el plus al empleado: "+super.getNombre());
            return true;
        }
        return false;
    }
}
