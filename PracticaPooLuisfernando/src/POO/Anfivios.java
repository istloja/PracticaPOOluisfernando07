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
public class Anfivios extends animal  {
    private String vivenenelagua;
   private boolean sonvertebrados;
   private Anfivios (){
       
   }

    public Anfivios(String vivenenelagua, boolean sonvertebrados, int adultoscrias) {
        this.vivenenelagua = vivenenelagua;
        this.sonvertebrados = sonvertebrados;
        this.adultoscrias = adultoscrias;
    }

    public Anfivios(String vivenenelagua, boolean sonvertebrados, int adultoscrias, String nombre, int edad, double peso, String color, double altura) {
        super(nombre, edad, peso, color, altura);
        this.vivenenelagua = vivenenelagua;
        this.sonvertebrados = sonvertebrados;
        this.adultoscrias = adultoscrias;
    }
    public String getVivenenelagua() {
        return vivenenelagua;
    }

    public void setVivenenelagua(String vivenenelagua) {
        this.vivenenelagua = vivenenelagua;
    }

    public boolean isSonvertebrados() {
        return sonvertebrados;
    }

    public void setSonvertebrados(boolean sonvertebrados) {
        this.sonvertebrados = sonvertebrados;
    }

    public int getAdultoscrias() {
        return adultoscrias;
    }

    public void setAdultoscrias(int adultoscrias) {
        this.adultoscrias = adultoscrias;
    }
   private int adultoscrias;
   
}
