package marvas;
import java.util.ArrayList;
import java.util.StringTokenizer;
import vistas.preguntaVista2;
/**
 *
 * @author Lozano Carvajal
 */
public class Respuestas {
    
    ArrayList<Integer> enteros = new ArrayList();
    String respuesta;

    public Respuestas(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
}