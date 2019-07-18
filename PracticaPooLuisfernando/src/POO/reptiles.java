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
public class reptiles extends animal  {
    private boolean searrastran;
    private int sondesangrefria;
    private boolean nacendehuevos;
    private reptiles (){
        
    }

    public reptiles(int searrastran, int sondesangrefria, boolean nacendehuevos, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.searrastran = searrastran;
        this.sondesangrefria = sondesangrefria;
        this.nacendehuevos = nacendehuevos;
    }


    public int getSearrastran() {
        return searrastran;
    }

    public void setSearrastran(int searrastran) {
        this.searrastran = searrastran;
    }

    public int getSondesangrefria() {
        return sondesangrefria;
    }

    public void setSondesangrefria(int sondesangrefria) {
        this.sondesangrefria = sondesangrefria;
    }

    public boolean isNacendehuevos() {
        return Nacendehuevos;
    }

    public void setNacendehuevos(boolean Nacendehuevos) {
        this.Nacendehuevos = Nacendehuevos;
    }
    private boolean Nacendehuevos;
    
}
