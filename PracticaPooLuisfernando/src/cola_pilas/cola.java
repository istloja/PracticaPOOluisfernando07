/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola_pilas;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author ISTLOJA1
 */
public class cola {
    int elemento;
cola siguiente;

	public  cola(int x) 
	{
		elemento = x;
		siguiente = null;
	}
}


class ColaLista 
{
	protected cola frente;
	protected  cola fin;

	
	public ColaLista() 
	{
		frente = fin = null;
	}

	
	public void insertar(int elemento) 
	{
		 cola a;
		a = new  cola(elemento);
		if (colaVacia()) {
			frente = a;
		} else {
			fin.siguiente = a;
		}
		fin = a;
	}

	
	public int quitar() 
	{
		int aux;
		if (!colaVacia()) 
		{
			aux = frente.elemento;
			frente = frente.siguiente;

		} else
		{
			return -1;
		}
		return aux;
	}

	
	public void borrarCola() 
	{
		while ( frente != null) 
		{
			frente = frente.siguiente;
		}
		
	}

	
	public boolean colaVacia() 
	{
		if(frente==null)
		{
			return true;			
		}else
		{
			return false;
		}
	}
}