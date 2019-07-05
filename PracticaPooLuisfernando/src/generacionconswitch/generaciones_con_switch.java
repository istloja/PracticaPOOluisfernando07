/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generacionconswitch;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class generaciones_con_switch {
    public static void main(String[] args) {
         System.out.println("ingrese 1 si nacistes 1946 - 1964");
        System.out.println("ingrese 2 si nacistes 1965 - 1979");
        System.out.println("ingrese 3 si nacistes 1980 - 1999");
        System.out.println("ingrese 4 si nacistes  2000");
        int numero1;
        Scanner entrada = new Scanner (System.in);  
        numero1 = entrada.nextInt();
       

        switch (numero1){
        case 1:
        System.out.println("Baby Boomers");
        break;
        case 2:
        System.out.println("Generación X");
        break;
        case 3:
        System.out.println("Milennials o Generación Y");
        break;
        case 4:
        System.out.println("Generación Z");
        break;
       
}
}
}