/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

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
public class TAdministradores {
    public void inicializarTabla(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("Nombre");
        titulos.add("Clave de usuario");
        
        for(int i = 0; i < ProyectoPOO.admins.size(); i++){
            Vector<Object> filas = new Vector<Object>();
            
            
            filas.add(ProyectoPOO.admins.get(i).getNombre());
            filas.add(ProyectoPOO.admins.get(i).getClaveUsuario());
            
            
            datos.add(filas);            
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos,titulos);
        
        tabla.setModel(modelo);
    }
}
