/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class Manejoexepciiones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero=0;
        try { //ponemos el codigo que queremos proteger
         numero = entrada.nextInt();
//        System.out.println("el numero ingresado es"+numero);
        }catch (Exception e){//ponemos la exepcion a capturar
            System.out.println(" Se generoel error"+e);
            System.out.println("Por favor ingrese el numero correcto");
    }
        System.out.println("el numero ingresado es"+numero);
        try {
        int resultado =numero/0;
        System.out.println(resultado);
        }catch (Exception e){
            System.out.println("No se puede dividir para cero aprenda matematicas ");
}
}
}