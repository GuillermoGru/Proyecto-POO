/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InicioDeAplicacion;

import Inventario.Recurso;
import Proyecto.MenuPrincipal;
import Usuarios.Administrativo;
import Usuarios.Normal;
import Usuarios.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author guillermo
 */
public class ProyectoPOO {
    public static int contador = 0;
    public static ArrayList<Recurso> recursosDisponibles = new ArrayList<Recurso>();
    public static ArrayList<Recurso> recursosPrestados = new ArrayList<Recurso>();
    public static ArrayList<Administrativo> admins = new ArrayList<Administrativo>();
    public static ArrayList<Normal> usuarios = new ArrayList<Normal>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada;
        String nombreArchivo = "CuentasNormal.txt";
        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String nombre = "", clave = "";
            boolean arroba = false;
            while( (entrada = br.readLine()) != null ){
                arroba = false;
                for(int i = 0; i < entrada.length(); i++){
                    char act = entrada.charAt(i);
                     if(act == '@'){
                         arroba = true;
                         continue;
                     }
                     if(!arroba){
                         nombre = nombre + act;
                     }else{
                         clave = clave + act;
                     }
                     
                 }
                Normal nuevoUsuario = new Normal(nombre,clave);
                usuarios.add(nuevoUsuario);
            }

            br.close();
        }
        catch(IOException ex1){
            System.out.println("Imposible abrir el archivo para leer");
        }
        
        nombreArchivo = "CuentasAdmin.txt";
        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String nombre = "", clave = "";
            boolean arroba = false;
            while( (entrada = br.readLine()) != null ){
                arroba = false;
                nombre = "";
                clave = "";
                for(int i = 0; i < entrada.length(); i++){
                    char act = entrada.charAt(i);
                     if(act == '@'){
                         arroba = true;
                         continue;
                     }
                     if(!arroba){
                         nombre = nombre + act;
                     }else{
                         clave = clave + act;
                     }
                     
                 }
                //System.out.println(nombre +  ' ' + clave);
                Administrativo nuevoAdmin = new Administrativo(nombre,clave);
                admins.add(nuevoAdmin);
            }

            br.close();
        }
        catch(IOException ex1){
            System.out.println("Imposible abrir el archivo para leer");
        }
        new MenuPrincipal().setVisible(true);
    }
    
}
