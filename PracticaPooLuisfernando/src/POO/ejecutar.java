/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author ISTLOJA1
 */
public class ejecutar {
   public static void main(String[] args) {
        animal objeto =new animal("jirafa",15,12,"amarillo",23);
        aves objetoaves =new aves (10, false,"pato",9,23,"negro",2);
        mamiferos objetomamiferos =new mamiferos (15, true,"vaca",6,34,"blanca",2);
        reptiles objetoreptile =new reptiles (5, true,"Culebra",2,3,"negro",4);
        Anfivios objetoAnfivio =new Anfivios (6, false,"sapo",6,7,"verde",5);
        System.out.println(objeto.informacionAnimal());
        System.out.println(objetoaves.informacionAnimal());
        System.out.println(objetomamiferos.informacionAnimal());
        System.out.println(objetoreptile.informacionAnimal());
        System.out.println(objetoAnfivio.informacionAnimal());
    }
}
