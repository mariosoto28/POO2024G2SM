/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.enumerators;

/**
 *
 * @author Datos
 */
enum GENERO {Femenino, Masculino}
enum ESTADO_CIVIL{Casado,Divorciado,Soltero}
public class Persona {
    
    public static void main(String[] args) {
        System.out.println("Genero:+GENERO.Masculino");
        for (ESTADO_CIVIL ec:ESTADO_CIVIL.values()){
            System.out.println(ec);
    }
}
}