/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola_pilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ISTLOJA1
 */
public class pilas {
   int elemento;
        pilas siguiente;
 
        pilas(int x) {
                elemento = x;
                siguiente = null;
        }
}
 
class PilaLista
{
        private pilas cima;
 
        public PilaLista()
        {
                cima = null;
        }
 
        // operaciones
 
        public boolean pilaVacia() {
               
                if(cima==null)
                {
                        return true;                   
                }else
                {
                        return false;
                }
               
        }
 
       
 
        public void insertar(int elemento)
        {
                pilas nuevo;
                nuevo = new pilas(elemento);
                nuevo.siguiente = cima;
                cima = nuevo;
        }
 
       
        public int quitar()
        {
                if (pilaVacia())
                {
                        return -1;
                }
                       
                int aux = cima.elemento;
                cima = cima.siguiente;
                return aux;
        }
 
       
 
        public void limpiarPila() {
                pilas t;
                while (!pilaVacia()) {
                        t = cima;
                        cima = cima.siguiente;
                        t.siguiente = null;
                }
        }
 
}