/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author ISTLOJA1
 */
public class EstaticosyDinamicos {
    public static void main(String[] args) {
        saludar();
//        para llamar un metodo static
        EstaticosyDinamicos objeto=new EstaticosyDinamicos();
        objeto.despedir();
//        asi se llama a un metodo no estatico
    }
    public static void saludar() {  
//        este es un metodo estatico
        System.out.println("Hola");
        
    }
    public void despedir() {
//         este es un metodo no estatico
        System.out.println("Chao");
    }
}
