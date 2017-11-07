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
public class VideoStreaming {

    public ArrayList<Video> getVideos() {
        return videos;
    }
    private ArrayList<Video>videos;

    public VideoStreaming() {
        this.videos = new ArrayList<>();
    }
    public void AddVideo(Video  video){
    this.videos.add(video);
    
    
    }
    public void addVideo(String titulo,int annio,String director,int capitulos,int temporada){
    
    
    }   
    public String ListarVideos(){
    String listaVideos="";
    for(Object video:videos){
    listaVideos+=video;
    
    }
    return listaVideos;
    }
    public ArrayList<Actor> listarActores(){
    ArrayList<Actor>actores=new ArrayList<>();
    for(Video video:videos){
    if(video instanceof Pelicula){
    
    Pelicula p=(Pelicula)video;
    actores.addAll(p.getActores());
    }
    
    }
    }
}
