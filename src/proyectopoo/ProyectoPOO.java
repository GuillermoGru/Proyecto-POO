/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo;

import Inventario.Recurso;
import Usuarios.Usuario;
import java.util.ArrayList;

/**
 *
 * @author guillermo
 */
public class ProyectoPOO {
    public static ArrayList<Recurso> recursosDisponibles = new ArrayList<Recurso>();
    public static ArrayList<Usuario> usuariosRegistrados = new ArrayList<Usuario>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MenuPrincipal().setVisible(true);
    }
    
}
