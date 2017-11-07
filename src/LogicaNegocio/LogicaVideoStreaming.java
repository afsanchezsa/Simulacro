/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import Datos.Serie;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class LogicaVideoStreaming {
    public void Cargar(String ruta){
    File lectura=new File(ruta);
    Scanner flujoEntrada=null;
    
    if(lectura.exists()){
    
    try{
    flujoEntrada=new Scanner(lectura);
    flujoEntrada.useDelimiter(",");
    String tipo=null,titulo=null,annio=null,director=null;
    int temporada=0,capitulos=0;
    
    while(flujoEntrada.hasNext()){
    tipo.flujoEntrada.next().trim();
    if(tipo.equals("S")){
    titulo=flujoEntrada.next().trim();
    annio=flujoEntrada.next().trim();
    director=flujoEntrada.next().trim();
    temporada=flujoEntrada.nextInt();
    capitulos=flujoEntrada.nextInt();
    Serie serie=new Serie(capitulos,temporada,titulo,capitulos,director);
    videoStreamming.addVideo(serie);
    
    videoStreamming.addVideo(titulo,capitulos,temporada,titulo,capitulos,temporada);
    
    }else if(tipo.equals("D")){
    titulo=flujoEntrada.next()
    
    }else if(tipo.equals("P")){
    
    
    }
            
    
    }
    
    }   catch (FileNotFoundException ex) {
            
        }
    }
    
    }
}
