/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos_serealisables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA1
 */
public class Leeryescribir {
    public void escribirObjeto(String direccion,Persona p1){
        try {
        ObjectOutputStream escritor=new ObjectOutputStream(new FileOutputStream(direccion));
        escritor.writeObject(p1);
        escritor.close();
        
        
    }
        catch (Exception e){
            System.out.println("se produjo un error"+e);
            
        }
        
            
        }
    public void leerArchivo (String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream (new FileInputStream(direccion) );
          Object auxiliar=lector.readObject();
          Persona p1 = (Persona) auxiliar;
            System.out.println(p1.getMascota().getNombre()+"su eddad es"+p1.getMascota().getEdad());
        }catch (Exception e){
            System.out.println(e);
            
        }
    }
    public void escribirLista(String direccion,List<Persona> Lista){
         try {
        ObjectOutputStream escritor=new ObjectOutputStream(new FileOutputStream(direccion));
             for (Persona persona : Lista) {
                 escritor.writeObject(persona);
                 
             }
             escritor.close();
         }catch (Exception e){
             System.out.println(e);
         }
    }
    public static void main(String[] args) {
        Leeryescribir objeto =new Leeryescribir();
        Persona p1 =new Persona("Pablo","Ramon",777,11,new Mascota("firulais",3,4) );
        Persona p2 =new Persona("Luis","Quevedo",666,12,new Mascota("anderson",4,4) );
        Persona p3 =new Persona("Diego","Ordoñez",888,13,new Mascota("blanco",2,4) );
        Persona p4 =new Persona("Daniel","Beltran",999,14,new Mascota("black",5,4) );
        List<Persona> lista=new ArrayList<>();//creamos la lista para guardar objetos
        //una vez creada la listaponemos los objetos de ella  
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        objeto.escribirLista("\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt", lista);
                
//        objeto.escribirObjeto("\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt",p2);
//        objeto.leerArchivo("\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt");
    }
}
