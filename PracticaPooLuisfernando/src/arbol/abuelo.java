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
public class abuelo extends persona{
     hijo nieto;
    hija nieta;
    padre hijo;
    madre hierna;

    public hijo getNieto() {
        return nieto;
    }

    public void setNieto(hijo nieto) {
        this.nieto = nieto;
    }

    public hija getNieta() {
        return nieta;
    }

    public void setNieta(hija nieta) {
        this.nieta = nieta;
    }

    public padre getHijo() {
        return hijo;
    }

    public void setHijo(padre hijo) {
        this.hijo = hijo;
    }

    public madre getHierna() {
        return hierna;
    }

    public void setHierna(madre hierna) {
        this.hierna = hierna;
    }
    public abuelo(){
    setNombres_y_Apellidos("Gregorio Ramon");
    setEdad(68);
    setGenero("Masculino");
    setOcupacion("Agricultura");
    setColor_de_Cabello("gris");
    setNumero_de_hijos(9);
    setDireccion("Nangora");
}

    void setHierna(madre madre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sethijo(padre padre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}

