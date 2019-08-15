/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos_serealisables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA1
 */
public class Mascota implements Serializable{
    private String nombre;
    private int edad;
    private int numerodepatas;
     private Mascota (){
         
     }

    public Mascota(String nombre, int edad, int numerodepatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numerodepatas = numerodepatas;
    }
        

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

    public int getNumerodepatas() {
        return numerodepatas;
    }

    public void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }
}

