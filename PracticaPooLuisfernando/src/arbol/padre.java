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
public class padre extends persona{
   madre esposa;
   abuelo Papá;
   abuela Mamá;
   hijo hijo;
   hija hija;

    public madre getEsposa() {
        return esposa;
    }

    public void setEsposa(madre esposa) {
        this.esposa = esposa;
    }

    public abuelo getPapá() {
        return Papá;
    }

    public void setPapá(abuelo Papá) {
        this.Papá = Papá;
    }

    public abuela getMamá() {
        return Mamá;
    }

    public void setMamá(abuela Mamá) {
        this.Mamá = Mamá;
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
    public padre(){
    setNombres_y_Apellidos("Patricio Quevedo");
    setEdad(40);
    setGenero("Masculino");
    setOcupacion("No se");
    setColor_de_Cabello("negro oscuro");
    setNumero_de_hijos(3);
    setDireccion("Quito");
}

    void sethijo(hijo hijo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sethija(hija hija) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setmamá(abuela abuela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setpapá(abuelo abuelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
} 
   