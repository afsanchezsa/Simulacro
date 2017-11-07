/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;

/**
 *
 * @author Estudiante
 */
public abstract  class Video {
    protected String titulo;
    protected int annio;
    protected String nombre;

    public Video(String titulo, int annio, String nombre) {
        this.titulo = titulo;
        this.annio = annio;
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnnio() {
        return annio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
