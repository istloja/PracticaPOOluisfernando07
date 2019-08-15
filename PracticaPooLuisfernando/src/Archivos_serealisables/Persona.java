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
public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private Mascota mascota;
    private Persona (){
        
    }

    public Persona(String nombre, String apellido, int telefono, int edad, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
        
    }
    public static void main(String[] args) {
        Persona p1 =new Persona ("luis","quevedo",666,19,new Mascota("anderson",6,4));
        Persona p2 =new Persona("Pablo","Ramon",777,19,new Mascota("firulais",3,4) );
        System.out.println("La persona se llama"+p1.getNombre()+"y su mascotaes"+p1.getMascota().getNombre());
        System.out.println("La persona se llama"+p2.getNombre()+"y su mascotaes"+p2.getMascota().getNombre());
    }
    
    
}
