/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author david
 */
public class Tesis extends Recurso{
    String institucion;

    public Tesis(String titulo, String autores, Fecha fechaPublicacion, String descripcion, int numSerieLocal, boolean disponible, Fecha fechaPrestamo, String institucion) {
        super(titulo, autores, fechaPublicacion, descripcion, numSerieLocal, disponible, fechaPrestamo);
        this.institucion = institucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    @Override
    public String toString() {
        return super.toString() + "Institucion = " + institucion;
    }
    
    
    
   
}
