/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo;

import Inventario.Recurso;
import Usuarios.Administrativo;
import Usuarios.Normal;
import Usuarios.Usuario;
import java.util.ArrayList;

/**
 *
 * @author guillermo
 */
public class ProyectoPOO {
    static int contador = 0;
    public static ArrayList<Recurso> recursosDisponibles = new ArrayList<Recurso>();
    public static ArrayList<Administrativo> admins = new ArrayList<Administrativo>();
    public static ArrayList<Normal> usuarios = new ArrayList<Normal>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MenuPrincipal().setVisible(true);
    }
    
}
