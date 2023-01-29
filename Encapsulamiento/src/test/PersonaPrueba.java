/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author lepo9
 */
import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);

        System.out.println("persona1 nombre: " + persona1.getNombre());
        //System.out.println("persona1: " + persona1.toString());
        //Se manda a llamar automaticamente el metodo toString
        System.out.println("persona1: " + persona1);
        
        persona1.setNombre("Juan Carlos");

//        System.out.println("persona1 nombre con cambioi: "+persona1.getNombre());
//        
//        System.out.println("persona1 sueldo: "+persona1.getSueldo());
//        System.out.println("persona1 eliminado: "+persona1.isEliminado());
        System.out.println("persona1: " + persona1.toString());

    }

}
