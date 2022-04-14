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
public abstract class Empleados { //El asbtract indica que no se puede crear ningún objeto con esta clase.
    //Atributos
    private String nombre;
    private int edad;
    private double salario;
    
    //Constante (se utiliza el "final" y se declara en mayúsculas
    public final double PLUS = 300;
    
    //Constructor
    public Empleados(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override //Indica que se lo va a heredar a una clase hija
    public String toString(){
        return "nombre: "+nombre+", edad: "+edad+", salario: "+salario+", ";
    }
    //Método abstracto, obliga a las clases hijas a que implementen esta función
    public abstract boolean plus();
}
