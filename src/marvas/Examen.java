/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cj
 */
public class Examen {
    
    String nombreExamen;
    ArrayList<Tema> posiblesTemas;

    public Examen(String nombreExamen, ArrayList<Tema> posiblesTemas) {
        this.nombreExamen = nombreExamen;
        this.posiblesTemas = posiblesTemas;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public ArrayList<Tema> getPosiblesTemas() {
        return posiblesTemas;
    }

    public void setPosiblesTemas(ArrayList<Tema> posiblesTemas) {
        this.posiblesTemas = posiblesTemas;
    }
    
    public void agregarTema(Tema tema){
    
        this.posiblesTemas.add(tema);
    }
    
    public double calificarExamen(){
        
        int cantidadPreguntas = 0;
        double calificacion = 0;
        for(int i = 0; i < this.posiblesTemas.size();i = i + 1){
        
            for(int j = 0; j < this.posiblesTemas.get(i).posiblesPreguntas.size(); j = j + 1){
                
                Pregunta preguntaIJ = this.posiblesTemas.get(i).posiblesPreguntas.get(j);
                cantidadPreguntas = cantidadPreguntas + 1;
                if(preguntaIJ.getRespuestaCorrecta() == preguntaIJ.getRespuestaSeleccionada()){
                    
                    calificacion = calificacion + 1;                
                }
            }
        }
        
        calificacion = calificacion / cantidadPreguntas;
        return calificacion;
    }
}
