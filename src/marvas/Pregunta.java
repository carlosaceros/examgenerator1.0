package marvas;
import java.util.ArrayList;

/**
 *
 * @author cj
 */
public class Pregunta {
    
    String enunciado;
    ArrayList<Respuestas> posiblesRespuestas;
    int respuestaCorrecta;
    int respuestaSeleccionada;
    

    public Pregunta(String enunciado, ArrayList<Respuestas> posiblesRespuestas, int respuestaCorrecta, int respuestaSeleccionada) {
        this.enunciado = enunciado;
        this.posiblesRespuestas = posiblesRespuestas;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaSeleccionada = respuestaSeleccionada;
        
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<Respuestas> getPosiblesRespuestas() {
        return posiblesRespuestas;
    }

    public void setPosiblesRespuestas(ArrayList<Respuestas> posiblesRespuestas) {
        this.posiblesRespuestas = posiblesRespuestas;
    }
    
    public void agregarRespuesta(Respuestas respuesta){
        
        this.posiblesRespuestas.add(respuesta);
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getRespuestaSeleccionada() {
        return respuestaSeleccionada;
    }

    public void setRespuestaSeleccionada(int respuestaSeleccionada) {
        this.respuestaSeleccionada = respuestaSeleccionada;
    }
       
}
