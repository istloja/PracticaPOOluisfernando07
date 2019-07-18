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
public class mamiferos extends animal {
    private int tiempodegestacion;
    private boolean pelaje;
    private mamiferos(){
        
    }

    public mamiferos(int tiempodegestacion, boolean pelaje) {
        this.tiempodegestacion = tiempodegestacion;
        this.pelaje = pelaje;
    }

    public mamiferos(int tiempodegestacion, boolean pelaje, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.tiempodegestacion = tiempodegestacion;
        this.pelaje = pelaje;
    }

    public int getTiempodegestacion() {
        return tiempodegestacion;
    }

    public void setTiempodegestacion(int tiempodegestacion) {
        this.tiempodegestacion = tiempodegestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
}
