/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvas;

import java.util.HashMap;

/**
 *
 * @author cj
 */
public class Tema {
    
    private int idTema;
    private String nombreTema;


    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }
    
    public String toString(){
    String foo = "ID: "+ this.idTema + ". NOMBRE:" + this.nombreTema; //example
    return foo;
    
    }
    
    /*public void listarTemas()
            
            {
                for (Integer name: temas.keySet())
                    {

                        String key =name.toString();
                        String value = temas.get(name).toString();  
                        System.out.println(key + "." + value);  


                    }
            }*/
    
    
    
}
