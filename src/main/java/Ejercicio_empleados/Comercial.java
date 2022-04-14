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
public class Comercial extends Empleados {
    //Atributos
    private double comision;
    
    //Constructor
    public Comercial(double comision, String nombre, int edad, double salario){
        super(nombre, edad, salario);
        this.comision = comision;
    }
    //Métodos
    public double getComision(){
        return comision;
    }
    public void setComision(){
        this.comision = comision;
    }
    @Override//Está heredando el método de la clase Empleados
    public String toString(){
        return super.toString()+"comisión: "+this.comision;
    }
    @Override//Está heredando el método de la clase Empleados
    public boolean plus(){
        if(super.getEdad() > 30 && this.comision > 200){ //con "super" se llama a un método de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS + this.comision;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadió el plus al empleado: "+super.getNombre());
            return true;
        }
        return false;
    }
}
