/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerealisables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA1
 */
public class Jugador implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private int perdidasbalon;
    private int asistencias;
    private double kmRecorridos;
    private int pasescompletados;
    private Jugador (){
        
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, int perdidasbalon, int asistencias, double kmRecorridos, int pasescompletados, int fallosGol, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.perdidasbalon = perdidasbalon;
        this.asistencias = asistencias;
        this.kmRecorridos = kmRecorridos;
        this.pasescompletados = pasescompletados;
        this.fallosGol = fallosGol;
        this.equipo = equipo;
    }

    public int getPerdidasbalon() {
        return perdidasbalon;
    }

    public void setPerdidasbalon(int perdidasbalon) {
        this.perdidasbalon = perdidasbalon;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getPasescompletados() {
        return pasescompletados;
    }

    public void setPasescompletados(int pasescompletados) {
        this.pasescompletados = pasescompletados;
    }

    public int getFallosGol() {
        return fallosGol;
    }

    public void setFallosGol(int fallosGol) {
        this.fallosGol = fallosGol;
    }
    private int   fallosGol;   
    
        

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    private Equipo equipo;
}
