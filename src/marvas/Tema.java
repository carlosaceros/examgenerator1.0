package marvas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cj
 */
public class Tema {
    
    String tituloTema;
    ArrayList<Pregunta> posiblesPreguntas;

    public Tema(String tituloTema, ArrayList<Pregunta> posiblesPreguntas) {
        this.tituloTema = tituloTema;
        this.posiblesPreguntas = posiblesPreguntas;
    }

    public String getTituloTema() {
        return tituloTema;
    }

    public void setTituloTema(String tituloTema) {
        this.tituloTema = tituloTema;
    }

    public ArrayList<Pregunta> getPosiblesPreguntas() {
        return posiblesPreguntas;
    }

    public void setPosiblesPreguntas(ArrayList<Pregunta> posiblesPreguntas) {
        this.posiblesPreguntas = posiblesPreguntas;
    }
    
    public void agregarPregunta(Pregunta pregunta){
    
        this.posiblesPreguntas.add(pregunta);
    }
    
}
