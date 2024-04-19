/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author guillermo
 */
public abstract class Recurso {
    String titulo;
    String autores;
    Fecha fechaPublicacion;
    String descripcion;
    int numSerieLocal;
    boolean disponible;
    Fecha fechaPrestamo;

    public Recurso(String titulo, String autores, Fecha fechaPublicacion, String descripcion, int numSerieLocal, boolean disponible, Fecha fechaPrestamo) {
        this.titulo = titulo;
        this.autores = autores;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.numSerieLocal = numSerieLocal;
        this.disponible = disponible;
        this.fechaPrestamo = fechaPrestamo;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumSerieLocal() {
        return numSerieLocal;
    }

    public void setNumSerieLocal(int numSerieLocal) {
        this.numSerieLocal = numSerieLocal;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Fecha getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Fecha fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    

    @Override
    public String toString() {
        return "Titulo = " + titulo + ", Autores = " + autores + ", Fecha de publicacion = " + fechaPublicacion + ", Descripcion = " + descripcion + ", Numero de Serie Local = " + numSerieLocal + ", Disponible = " + disponible;
    }
    
    public String toStringPrestamo(){
         return "Titulo = " + titulo + "Numero de Serie Local = " + numSerieLocal + "Fecha de Prestamo = " + fechaPrestamo;
    }

    public Object getEditorial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
