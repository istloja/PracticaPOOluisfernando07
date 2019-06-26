/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber;

import java.io.IOException;

/**
 *
 * @author ISTLOJA1
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
         //declaracion de variables
         int kilometros = 0;
         int litrosGasolina = 0;
         char r;
         int contador = 0;
         while(true){
             r = Lectura.leerCaracter("Registrar reabastecimiento (y~n)?: ");
             switch(r){
                 case 'n':
                     break;
                 case 'y':
                     System.out.println("Reabastecimiento #"+(++contador));
                     kilometros += Integer.parseInt(Lectura.leer("Distancia(Km): "));
                     litrosGasolina += Integer.parseInt(Lectura.leer("Gasolina(l): "));                   
                     break;
                 default:
                     System.out.println("Opcion no válida");
                     break;
             }
             if(r=='n') break;
         }    
         System.out.println("Reporte:");
         System.out.println("Total Kilómetros: "+kilometros
                 + "\nTotal Gasolina: "+litrosGasolina
                 + "\nPromedio: "+((double)kilometros/contador)+"/"+
                 (double)litrosGasolina/contador+" km/l");
     }

    private static class Lectura {

        private static char leerCaracter(String registrar_reabastecimiento_yn_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String leer(String distanciaKm_) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Lectura() {
        }
    }
}

 

