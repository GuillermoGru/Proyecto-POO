/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author a19200865
 */
public class Revista extends Literatura{
    int ISBN;

    public Revista(String titulo, String autores, Fecha fechaPublicacion, String descripcion, int numSerieLocal, boolean disponible, Fecha fechaPrestamo, String editorial, int ISBN) {
        super(titulo, autores, fechaPublicacion, descripcion, numSerieLocal, disponible, fechaPrestamo, editorial);
        this.ISBN = ISBN;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "ISBN = " + ISBN;
    }
    
    
}
