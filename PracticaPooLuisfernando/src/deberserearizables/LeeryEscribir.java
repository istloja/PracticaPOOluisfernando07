/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberserearizables;

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
public class LeeryEscribir {
    public List<Estudiante> leerPersonas(String url) {

            List<Estudiante> Lista = new ArrayList<Estudiante>();
            try {
                ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
                Object auxiliar = lector.readObject();
                while (auxiliar != null) {
                    Estudiante p1 = (Estudiante) auxiliar;
                    Lista.add(p1);
                    auxiliar = lector.readObject();
                }

            } catch (Exception e) {//
                System.out.println("error"+e);
            }


        return Lista;

    }

    public void leerLista(String variable) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(variable));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante p1 = (Estudiante) auxiliar;// cambio de objeto a persona
                System.out.println("su direccion "+p1.getDireccion());
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void escribirObjeto(String direccion, Estudiante p1) {

        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            escritorio.writeObject(p1);                                                                  // input para leer Output para escribir en el objeto
            escritorio.close();
        } catch (Exception e) {
            System.out.println("se produjo un error en " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Estudiante p1 = (Estudiante) auxiliar;
            System.out.println("leer direccion");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {//POR CADA VEZ Q rrecorro la lista creo un objeto de la clase persdona
                escritorio.writeObject(estudiante);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Estudiante p2=new Estudiante ("luis2","quevedo2",19,"sauces norte",new Materia
        (" lengua ",2,"vicente",new Carrera("mecanica2",5,2)));
        Estudiante p3=new Estudiante (" anderson "," Gusman",21,"argelia",new Materia
        (" razonamiento logico ",2,"vicente",new Carrera("mecanica3",5,2)));
           Estudiante p4=new Estudiante (" diego "," ordoñez ",26,"loja",new Materia
        (" fisiica ",2,"jhon",new Carrera("mecanica3",5,2)));
              Estudiante p5=new Estudiante (" Daniel "," beltran ",23,"vergel",new Materia
        (" ciencias naturales ",2,"vicente",new Carrera("mecanica3",5,2)));
                Estudiante p6=new Estudiante (" pablo  "," ramon ",14,"carmen",new Materia
        (" anatomia",2,"vicente",new Carrera("mecanica3",5,2)));
                  Estudiante p7=new Estudiante (" francel "," pineda ",18,"",new Materia
        (" biologia ",2,"vicente",new Carrera("mecanica3",5,2)));
                    Estudiante p8=new Estudiante (" ramiro "," capa ",29," cucanama ",new Materia
        (" quimica ",2,"vicente",new Carrera("mecanica3 ",5,2)));
                      Estudiante p9=new Estudiante (" jhon "," puglla ",31,"belen ",new Materia
        (" computacion ",2,"vicente",new Carrera("mecanica3",5,2)));
                        Estudiante p10=new Estudiante (" Rafael "," Correa ",20," Belgica",new Materia
        (" matematicas ",2,"vicente",new Carrera("Contabilidad3 ",5,2)));
                          Estudiante p11=new Estudiante (" lenin "," moreno ",19," quito ",new Materia
        (" educacion fisica3 ",2,"vicente",new Carrera("mecanica3",5,2)));



        List<Estudiante> Lista = new ArrayList<>();//creamos la lista para guarar objetos
        //una vez que creasmos la lista ponemos los objetos dentro de ella

        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
       Lista.add(p5);
       Lista.add(p6);
         Lista.add(p7);
        Lista.add(p8);
        Lista.add(p9);
       Lista.add(p10);
       Lista.add(p11);
        int a = Lista.size();// numero de listas
        System.out.println(" numero de listas"+a);
     for (Estudiante estudiante : Lista) {// imporimo los nombres de la lista
      

          System.out.println("Nombre "+estudiante.getNombre()+" Apellido "+ estudiante.getApellido()+" edad "+ estudiante.getEdad()+" Direccion "+estudiante.getDireccion()+" Materia"+
                  estudiante.getMateria().getNombre()+" Creditos "+estudiante.getMateria().getCreditos()+" Docente "+estudiante.getMateria().getDocente()+" Carrera "+estudiante.getMateria().getCarrera().getNombre()
                  +" Ciclos "+estudiante.getMateria().getCarrera().getNumerCiclos()+"  Numero de creditos"+estudiante.getMateria().getCarrera().getNumeroCreditos());
//            
//            
//        }
//        System.out.println(Lista.size());
       objeto.escribirLista("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt", Lista);

      // objeto.escribirObjeto("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt", p2);
        //objeto.leerArchivo("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt");
        //objeto.leerLista("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt");
      //  List<Estudiante> b=objeto.leerPersonas("C:\\Users\\USUARIO\\Desktop\\ejemplo.txt");
        //for (Estudiante estudiante : b) {
           // System.out.println("edades "+ p2.getNombre());

        }

    }
}
