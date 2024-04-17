/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author david
 */
public class Literatura extends Recurso{
    String editorial;

    public Literatura(String titulo, String autores, Fecha fechaPublicacion, String descripcion, int numSerieLocal, boolean disponible, Fecha fechaPrestamo, String editorial) {
        super(titulo, autores, fechaPublicacion, descripcion, numSerieLocal, disponible, fechaPrestamo);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString() + "Editorial = " + editorial;
    } 
    
}
