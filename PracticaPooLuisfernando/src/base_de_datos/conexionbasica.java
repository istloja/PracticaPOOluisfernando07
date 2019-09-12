/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_de_datos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ISTLOJA1
 */
public class conexionbasica {
    public void leer (String Usuario,String clave){
        try {
         DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1",Usuario,clave);
            System.out.println(conexion.getCatalog());
            Statement variable =conexion.createStatement();
            ResultSet resul= variable.executeQuery("select * from persona");
            while(resul.next()){
                System.out.println(resul.getString("nombre"));
                 System.out.println(resul.getString("apellido"));
            }
            
        } catch (Exception e){
            System.out.println("se produjo un error en"+e);
        }
        
    }
    public static void main(String[] args) {
        conexionbasica objeto =new conexionbasica();
        objeto.leer("luis", "1234");
    }
}
