/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author ISTLOJA1
 */
public class madre extends persona{
   padre esposo;
   abuelo suegro;
   abuela suegra;
   hijo hijo;
   hija hija;

    public padre getEsposo() {
        return esposo;
    }

    public void setEsposo(padre esposo) {
        this.esposo = esposo;
    }

    public abuelo getSuegro() {
        return suegro;
    }

    public void setSuegro(abuelo suegro) {
        this.suegro = suegro;
    }

    public abuela getSuegra() {
        return suegra;
    }

    public void setSuegra(abuela suegra) {
        this.suegra = suegra;
    }

    public hijo getHijo() {
        return hijo;
    }

    public void setHijo(hijo hijo) {
        this.hijo = hijo;
    }

    public hija getHija() {
        return hija;
    }

    public void setHija(hija hija) {
        this.hija = hija;
    }
   public madre(){
    setNombres_y_Apellidos("Ruth Esperanza Ramon Ordoñez");
    setEdad(47);
    setGenero("Femenino");
    setOcupacion("Trabajadora Domestica");
    setColor_de_Cabello("cafe oscuro");
    setNumero_de_hijos(6);
    setDireccion("Nangora");
}

    void sethijo(hijo hijo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sethija(hija hija) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    