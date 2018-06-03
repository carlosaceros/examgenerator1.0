
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author cj
 */
public class Marvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        HashMap< Integer, String > temas = new HashMap<  >();
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        int rtaTemas = 1;
        int rtaPregunta = 1;
        int indiceTemas = 1;
        
        while (rtaTemas == 1)
        {
            
            Scanner lector = new Scanner(System.in);
        
            System.out.println("Ingrese el nombre del tema: ");
            String nombreTemaTemp = lector.nextLine();
            temas.put(indiceTemas, nombreTemaTemp);
            indiceTemas++;
            System.out.println("Desea agregar otro tema? si: 1/no: 0");
            int tempRta = lector.nextInt();
                rtaTemas = tempRta;
        }
        
        /*Set<Integer> listar = temas.keySet();
        System.out.println("******LISTA DE TEMAS*****");
        listar.stream().map((i) -> temas.get(i)).forEachOrdered((valor) -> {
            System.out.println(valor);
        });*/
        
        
        System.out.println("******INGRESO DE PREGUNTAS*****");
        System.out.println("******TEMAS INGRESADOS*****");
        
        for (Integer name: temas.keySet()){

                String key =name.toString();
                String value = temas.get(name).toString();  
                System.out.println(key + "." + value);  


            }
                Scanner lector = new Scanner(System.in);
        
                while (rtaPregunta == 1){
            
            
        
                    System.out.println("La pregunta pertenece al tema con el ID: ");
                    
                   
                        int idTemaTemp = lector.nextInt();
                        lector.nextLine(); 
                    

                    System.out.println("Ingrese el enunciado: ");
                    String pregTemp = lector.nextLine();

                    System.out.println("Ingrese la respuesta correcta: ");
                    String rtaTemp = lector.nextLine();

                    Pregunta pregun = new Pregunta();
                    pregun.setIdTema(idTemaTemp);
                    pregun.setEnunciado(pregTemp);
                    pregun.setRespuestaCorrecta(rtaTemp);

                    preguntas.add(pregun);

                    System.out.println("Desea agregar otra pregunta? si: 1/no: 0");
                    int tempRta = lector.nextInt();
                    rtaPregunta = tempRta;
                }
                
                System.out.println("----PREGUNTAS INGRESADAS----");
        
        Iterator<Pregunta> iterator = preguntas.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
                }
            
        
        
        
    }
    
    }
