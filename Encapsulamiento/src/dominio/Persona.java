/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author lepo9
 */
public class Persona {
    
    //Definicion de atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    
    //Definicion de constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
    
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    //Metodos para modificar y recuperar nombre
    
    public String getNombre(){
    
        return this.nombre;
    }
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    
    public double getSueldo(){
    
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
    
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){
    
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
    
        this.eliminado = eliminado;
    }
}
