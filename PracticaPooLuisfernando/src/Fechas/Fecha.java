/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class Fecha {
    public static void main(String[] args) {
        Date fechaActual= new Date();
        System.out.println(fechaActual);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner entrada =new Scanner (System.in);
        System.out.println("Ingrese la fechaen el formato dd/MM/yyyy");
        String fecha=entrada.nextLine();
         Date fechanacimiento=null;
        try {
            fechanacimiento=formato.parse("2000/04/06");
            System.out.println(fechanacimiento);
//            System.out.println(fechanacimiento.before(fechaActual));
        } catch (Exception e){
            System.out.println(e);
        }
        GregorianCalendar calendario =new GregorianCalendar ();
        calendario.setTime(fechaActual);
        int anioactual=calendario.get(GregorianCalendar.YEAR);
        int mesactual=calendario.get(GregorianCalendar.MONTH)+1;
        int diaactual=calendario.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("anioactual"+anioactual+"mes"+mesactual+"dia"+diaactual);
         GregorianCalendar calendario1 =new GregorianCalendar ();
          int anionac=calendario.get(GregorianCalendar.YEAR);
          int mesnac=calendario.get(GregorianCalendar.MONTH)+1;
          int dianac=calendario.get(GregorianCalendar.DAY_OF_MONTH);
          int meses=0;
          int año=0;
          int dia = 0;
          año= anioactual-anionac;
          if (anioactual<anionac);
          
          meses = mesactual-mesnac;
          if(mesactual>mesnac)
          dia= diaactual-dianac;
          if (diaactual>dianac)
          System.out.println("Usted tiene"+año+"años"+meses+"meses"+dia+"dias");
          
    }
   
}
