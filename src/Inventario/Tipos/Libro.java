    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario.Tipos;

import Inventario.Fecha;

/**
 *
 * @author a19200865
 */
public class Libro extends Literatura{
    int ISSN;

    public Libro(String titulo, String autores, Fecha fechaPublicacion, String descripcion, int numSerieLocal, boolean disponible, Fecha fechaPrestamo, String editorial, int ISSN) {
        super(titulo, autores, fechaPublicacion, descripcion, numSerieLocal, disponible, fechaPrestamo, editorial);
        this.ISSN = ISSN;
    }

    public int getISSN() {
        return ISSN;
    }

    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }

    @Override
    public String toString() {
        return super.toString() + "ISSN = " + ISSN;
    }
    
    
}
