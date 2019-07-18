/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author ISTLOJA1
 */
public class animal {
 private String nombre;
 private int edad;
 private double peso;
 private String color;
 private double altura;
public animal(){
}
    public animal(String nombre, int edad, double peso, String color, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.altura = altura;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
public void nombreAnimal (){
    System.out.println(" Hola soy un animal");
    
  }
public String informacionAnimal(){
    String informacion=nombre+" "+color+" "+edad+" "+altura+" "+peso;
    return informacion;
}
    public static void main(String[] args) {
        animal objeto= new animal ();
        objeto.setNombre("Perro");
        objeto.setEdad(10);
        objeto.setAltura(15);
        objeto.setColor("blanco");
         System.out.println(objeto.informacionAnimal());
        animal objeto1=new animal("gato",5,8,"negro",10);
        System.out.println(objeto1.informacionAnimal());
    }
}      
    
 

