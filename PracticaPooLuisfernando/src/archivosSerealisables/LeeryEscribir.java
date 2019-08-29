/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerealisables;

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

    public List<Jugador> leerJugador1(String url) {

        List<Jugador> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador p1 = (Jugador) auxiliar;
                Lista.add(p1);
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {//
            System.out.println("error" + e);
        }

        return Lista;
    }

    public int edadMayor(List<Jugador> Lista) {
        int edadMayor = Lista.get(0).getEdad();
        for (Jugador jugador : Lista) {
            if (jugador.getEdad() > edadMayor) {
                edadMayor = jugador.getEdad();
            }
        }
        return edadMayor;

    }

    public Jugador edadMenor(List<Jugador> Lista) {
        Jugador edadMenor = Lista.get(0);
        for (Jugador jugador : Lista) {
            if (edadMenor.getEdad() > jugador.getEdad()) {
                edadMenor = jugador;
            }
        }
        return edadMenor;

    }

    public void leerLista(String variable) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(variable));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador j1 = (Jugador) auxiliar;
                System.out.println(" " + j1.getNombre());
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void escribirLista(String nombre, List<Jugador> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(nombre));
            for (Jugador jugador : lista) {
                escritorio.writeObject(jugador);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public double PorcentajeAcierto(Jugador jugadorpro) {
        return (jugadorpro.getNumeroGoles() + jugadorpro.getAsistencias() / jugadorpro.getFallosGol());
    }

    public double PorcentajeEfectividad(Jugador jugadorfec) {
        return (jugadorfec.getPasescompletados() / jugadorfec.getPerdidasbalon());
    }

    public double EficienciaJugador(Jugador jugadorfi) {
        return (PorcentajeAcierto(jugadorfi) + PorcentajeEfectividad(jugadorfi) + jugadorfi.getKmRecorridos());
    }

    public Jugador MayorEficiencia(List<Jugador> lista) {
        Jugador mayorefect = lista.get(0);
        for (Jugador jugador : lista) {
            if (EficienciaJugador(jugador) > EficienciaJugador(mayorefect)) {
                mayorefect = jugador;
            }
        }
        return mayorefect;
    }

    public Jugador MporcentajeAcierto(List<Jugador> lista) {
        Jugador mayorporcentaje = lista.get(0);
        for (Jugador jugador : lista) {
            if (PorcentajeAcierto(jugador) > PorcentajeAcierto(mayorporcentaje)) {
                mayorporcentaje = jugador;

            }

        }
        return mayorporcentaje;
    }

    public Jugador Mporcentajeefectividad(List<Jugador> lista) {
        Jugador Mporcentajeefectividad = lista.get(0);
        for (Jugador jugador : lista) {
            if (PorcentajeEfectividad(jugador) > PorcentajeEfectividad(Mporcentajeefectividad)) {
                Mporcentajeefectividad = jugador;
            }

        }
        return Mporcentajeefectividad;
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Jugador j1 = new Jugador("cristiano", "ronaldo", 33, 520, 2005, 1, 3, 4, 5, 10, new Equipo("Juventus", 20, "turin"));
        Jugador j2 = new Jugador("leonel", "messi", 31, 600, 2007, 2, 4, 6, 8, 12, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador j3 = new Jugador("neymar", "jr", 28, 200, 2011, 3, 5, 5, 6, 1, new Equipo("PSG", 10, "Paris"));
        Jugador j4 = new Jugador("edder", "hazar", 27, 300, 2010, 4, 6, 2, 9, 15, new Equipo("Real madrid", 40, "Madrid"));
        List<Jugador> lj = new ArrayList<>();
        lj.add(j1);
        lj.add(j2);
        lj.add(j3);
        lj.add(j4);
        System.out.println("a");
//     for (Persona pers : lista){
//         System.out.println(pers.getNombre);
//     }
        objeto.escribirLista("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo", lj);

        //objeto.leerLista("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo");
        List<Jugador> b = objeto.leerJugador1("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt");
        for (Jugador persona : b) {
            System.out.println(persona.getEdad());
        }
//        System.out.println("el jugador con menor edad es "+objeto.edadmenorObjeto(b).getNombre());
//        System.out.println("el juador que mas pronto debuto es "+" "+objeto.debutoP(b).getNombre()+" y su año de debut"+" "+objeto.debutoP(b).getAñoDebut());
//        System.out.println("el equipo con mas titulos es;"+" "+objeto.titulos(b).getEquipo().getNombre()+" con; "+" "+objeto.titulos(b).getEquipo().getNumerotitulos()+" "+"titulos");
//        System.out.println("el jugadore mas eficiente es :"+objeto.MayorEficiencia(b).getNombre());
        //System.out.println("el jugador con mas porcentaje es:" + objeto.MporcentajeAcierto(b).getNombre());
        //System.out.println("el jugador con mas porcentaje de efectividad es: " + objeto.Mporcentajeefectividad(b).getNombre());
    }

}
