/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerealisables_practica;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA1
 */
public class Autor implements Serializable{
    private String nombre;
    private String apellidos;
    private int edad ;
    private int telefono;
    private int numero_de_libros_creados;
    private String direccion;
    private Autor (){
        
    }

    public Autor(String nombre, String apellidos, int edad, int telefono, int numero_de_libros_creados, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.numero_de_libros_creados = numero_de_libros_creados;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumero_de_libros_creados() {
        return numero_de_libros_creados;
    }

    public void setNumero_de_libros_creados(int numero_de_libros_creados) {
        this.numero_de_libros_creados = numero_de_libros_creados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
