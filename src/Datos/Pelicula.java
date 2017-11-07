/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pelicula extends Video {
private ArrayList<Actor>actores;
public Pelicula(String titulo, int annio,String director){
super(titulo,annio,director);
this.actores=new ArrayList<>();
}
   public void addActor(Actor actor){
   this.actores.add(actor);
   }
    public void addActor(String nombre, String apellido){
    Actor actor=new Actor(nombre,apellido);
    this.actores.add(actor);
    
    }//sobrecargamos el metodo addActor
    public String retornarInformacion(){
    String informacion="";
    for(Actor actor:actores){
    informacion+=actor;
    
    
    }
    return informacion;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }
}
