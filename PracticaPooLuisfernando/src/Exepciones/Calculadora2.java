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
public class Calculadora2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para suma");
        System.out.println("ingrese 2 para resta");
        System.out.println("ingrese 3 para multiplicacion");
        System.out.println("ingrese 4 para division");
        try{
        int valor = entrada.nextInt();
            System.out.println("el valor ingresado es: "+valor);
        switch (valor) {
            case 1:
                System.out.println("ingresaste a la suma");
                System.out.println("ingrese los numeros que dese sumar");
                int a = 0;
                int b = 0;
                try{
                b = entrada.nextInt();
                a = entrada.nextInt();
                System.out.println("los numeros ingresados son: " + b + " y " + a);
                }catch(Exception e){
                    System.out.println("se genero un error " + a);
            System.out.println("Por favor ingrese un numero correcto");
                }
                try {
                    int suma = b + a;
                    System.out.println("la suma de los dos numero es: " + suma);
                } catch (Exception e) {
                    System.out.println("se genero un error " + a);
                    System.out.println("porfavor ingrese los numeros correctamente");
                }
                break;
            case 2:
                System.out.println("ingresaste a la resta");
                System.out.println("ingrese los numeros que dese restar");
                int c = 0;
                int d = 0;
                try{
                c = entrada.nextInt();
                d = entrada.nextInt();
                System.out.println("los numeros ingresados son: " + c + " y " + d);
                }catch(Exception e){
                    System.out.println("se genero un error " + c);
            System.out.println("Por favor ingrese un numero correcto");
                }
                try {
                    int resta = c - d;
                    System.out.println("la suma de los dos numero es: " + resta);
                } catch (Exception e) {
                    System.out.println("se genero un error " + c);
                    System.out.println("porfavor ingrese los numeros correctamente");
                }
                break;
            case 3:
                System.out.println("ingresaste a la multiplicacion");
                System.out.println("ingrese los numeros que dese multiplicar");
                int l = 0;
                int m = 0;
                try{
                l = entrada.nextInt();
                m = entrada.nextInt();
                System.out.println("los numeros ingresados son: " + l + " y " + m);
                }catch(Exception e){
                    System.out.println("se genero un error " + l);
            System.out.println("Por favor ingrese un numero correcto");
                }
                try {
                    int multiplicacion = l * m;
                    System.out.println("la suma de los dos numero es: " + multiplicacion);
                } catch (Exception e) {
                    System.out.println("se genero un error " + l);
                    System.out.println("porfavor ingrese los numeros correctamente");
                }
                break;
            case 4:
                System.out.println("ingresaste a la division");
                System.out.println("ingrese los numeros que dese dividir");
                int s = 0;
                int p = 0;
                try{
                s = entrada.nextInt();
                p = entrada.nextInt();
                System.out.println("los numeros ingresados son: " + s + " y " + p);
                }catch(Exception e){
                    System.out.println("se genero un error " + s);
            System.out.println("Por favor ingrese un numero correcto");
                }
                try {
                    int division = s / p;
                    System.out.println("la suma de los dos numero es: " + division);
                } catch (Exception e) {
                    System.out.println("se genero un error " + s);
                    System.out.println("porfavor ingrese los numeros correctamente");
                }
                break;
            default:
                System.out.println("ingrese un numero correcto:");
                break;

        }
        }catch(Exception a){
            System.out.println("se produjo un error "+a);
            System.out.println("porfavor ingrese los numeros correctamente");
        }
    }
}


