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
public class aves extends animal {
    private int numero_de_huevos;
    private boolean vuela;
     private aves () {
         
     }

    public aves(int numero_de_huevos, boolean vuela) {
        this.numero_de_huevos = numero_de_huevos;
        this.vuela = vuela;
    }

    public aves(int numero_de_huevos, boolean vuela, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.numero_de_huevos = numero_de_huevos;
        this.vuela = vuela;
    }
    

    public int getNumero_de_huevos() {
        return numero_de_huevos;
    }

    public void setNumero_de_huevos(int numero_de_huevos) {
        this.numero_de_huevos = numero_de_huevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
   

}

   
   