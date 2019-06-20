/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class Voidydatos {
//    es un metodo de tipo void q suma dos numeros y presenta el resultado 
    public void sumar (int numero1, int numero2){ //resibe 2 numeros de tipo entero
        System.out.println("La suma es "+(numero1+numero2));//presenta el resultado
        
    }
    //los metodos q devuelven  datos pueden ser de diferentes tipos
    //int,double,String,char,boolean y tambien pueden ser objetos
    public int sumar1(int numero1, int numero2 ){
        return numero1+numero2;
    }
    public String unirCadena(String cadena1,String cadena2){
        return cadena1+cadena2;
    }
    public boolean iniciaSeccion(String usuario, String password){
       
        boolean valor=false;
        if (usuario.equals("admin") && password.equals("1234")){
            valor = true;
        }
        return valor;
        
    }
    public static void main(String[] args) {
        Voidydatos objeto=new Voidydatos(); //creamos un objeto
        objeto.sumar(10,8);//llamamos al metodo sumar y enviamos 2 numeros
         objeto.sumar(11,23);
          objeto.sumar(80,7);
          int resultado=objeto.sumar1(40,10);//guardo lo q devuelve el metodo 1
          System.out.println("La suma es"+resultado);
          String cadena=objeto.unirCadena("hola", "Mundo");
          System.out.println("La cadena unida es "+cadena);
          boolean inicia=objeto.iniciaSeccion("admin","1234");
          System.out.println(inicia);
          Scanner entrada = new Scanner (System.in);
          System.out.println("ingrese el usuario");
          String usuario=entrada.next();
          System.out.println("ingrese la contraseña");
          String password=entrada.next();
          boolean inicioseccion=objeto.iniciaSeccion(usuario,password);
          if(inicioseccion){
              System.out.println("Bienvenidos al sistema");
          }else{
              System.out.println("Credenciales incorrecta");
          }
          
    }   
}
