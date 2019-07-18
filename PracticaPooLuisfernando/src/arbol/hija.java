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
public class hija extends persona {
    madre madre;
    padre padre;
    abuela abuela;
    abuelo abuelo;

    public madre getMadre() {
        return madre;
    }

    public void setMadre(madre madre) {
        this.madre = madre;
    }

    public padre getPadre() {
        return padre;
    }

    public void setPadre(padre padre) {
        this.padre = padre;
    }

    public abuela getAbuela() {
        return abuela;
    }

    public void setAbuela(abuela abuela) {
        this.abuela = abuela;
    }

    public abuelo getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(abuelo abuelo) {
        this.abuelo = abuelo;
    }
    public hija(){
    setNombres_y_Apellidos("Sofia Daniela Jerez Ramon");
    setEdad(14);
    setGenero("Femenino");
    setOcupacion("Estudiante ");
    setColor_de_Cabello("cafe oscuro");
    setDireccion("Nangora");
}

    void setpadre(padre padre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setmadre(madre madre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setabuelo(abuelo abuelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setabuela(abuela abuela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}   