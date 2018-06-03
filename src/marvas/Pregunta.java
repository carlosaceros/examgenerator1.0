/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvas;

/**
 *
 * @author cj
 */
public class Pregunta {
    
    private String enunciado;
    private String respuestaCorrecta;
    int idTema;

    
    
    

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String toString(){
    String foo = "Enunciado: "+ this.enunciado + ". \n Respuesta Correcta:" + this.respuestaCorrecta + "\n Pertenece al tema: " + this.idTema +"\n ---------"; //example
    return foo;
    
    }
    
    
    
}
