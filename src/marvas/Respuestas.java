package marvas;
import java.util.StringTokenizer;
import vistas.preguntaVista2;
/**
 *
 * @author Lozano Carvajal
 */
public class Respuestas {
    
    String [] respuestas = {
    
        preguntaVista2.getR1() + " " + preguntaVista2.getR2() + " " + preguntaVista2.getR3() + " " + preguntaVista2.getR4() 
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String [] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena, separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while (token.hasMoreTokens()){
            a[i] = token.nextToken();
            i = i+1;
        }
        
        return a;
    }
}