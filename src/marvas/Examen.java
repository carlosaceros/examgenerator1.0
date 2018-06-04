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
public class Examen {
    
    HashMap< Integer, Pregunta > examen = new HashMap<  >();
    Pregunta preg = new Pregunta();
    
    int id_tema;
    int cantidad_preguntas;

    public HashMap<Integer, Pregunta> getExamen() {
        return examen;
    }

    public void setExamen(HashMap<Integer, Pregunta> examen) {
        this.examen = examen;
    }

    public int getId_tema() {
        return id_tema;
    }

    public void setId_tema(int id_tema) {
        this.id_tema = id_tema;
    }

    public int getCantidad_preguntas() {
        return cantidad_preguntas;
    }

    public void setCantidad_preguntas(int cantidad_preguntas) {
        this.cantidad_preguntas = cantidad_preguntas;
    }
    
    
    
    public void agregarExamen(int id_tema, Pregunta preg){
        
        examen.put(id_tema, preg);
    }
    
    public void mostrarExamen(){
                for (Integer name: examen.keySet())
                    {

                        String key =name.toString();
                        String value = examen.get(name).toString();  
                        System.out.println(key + "." + value);  


                    }
            }
    
}
