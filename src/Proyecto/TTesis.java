/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import InicioDeAplicacion.ProyectoPOO;
import Inventario.Tipos.Libro;
import Inventario.Tipos.Revista;
import Inventario.Tipos.Tesis;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class TTesis {
    public void inicializarTabla(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("Titulo");
        titulos.add("Autores");
        titulos.add("Fecha de publicacion");
        titulos.add("Descripcion");
        titulos.add("No. Serie");
        titulos.add("Disponible");
        titulos.add("Institución");
        
        for(int i = 0; i < ProyectoPOO.recursosDisponibles.size(); i++){
            Vector<Object> filas = new Vector<Object>();
            
            
            filas.add(ProyectoPOO.recursosDisponibles.get(i).getTitulo());
            filas.add(ProyectoPOO.recursosDisponibles.get(i).getAutores());
            filas.add(ProyectoPOO.recursosDisponibles.get(i).getFechaPublicacion());
            filas.add(ProyectoPOO.recursosDisponibles.get(i).getDescripcion());
            filas.add(ProyectoPOO.recursosDisponibles.get(i).getNumSerieLocal());
            filas.add(ProyectoPOO.recursosDisponibles.get(i).isDisponible());
            filas.add(((Tesis)ProyectoPOO.recursosDisponibles.get(i)).getInstitucion());
            
            datos.add(filas);            
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos,titulos);
        
        tabla.setModel(modelo);
    }
}
