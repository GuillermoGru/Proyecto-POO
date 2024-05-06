/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import Usuarios.Usuario;
import java.util.ArrayList;
import Inventario.*;

/**
 *
 * @author guillermo
 */
public class Biblioteca {
    ArrayList<Recurso> recursosDisponibles;
    ArrayList<Usuario> usuarios;
    ArrayList<Recurso> librosPrestados;

    public Biblioteca(ArrayList<Recurso> recursosDisponibles, ArrayList<Usuario> usuarios, ArrayList<Recurso> librosPrestados) {
        this.recursosDisponibles = recursosDisponibles;
        this.usuarios = usuarios;
        this.librosPrestados = librosPrestados;
    }

    public ArrayList<Recurso> getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(ArrayList<Recurso> recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Recurso> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Recurso> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    
    public void agregarRecurso(Recurso recurso){
        recursosDisponibles.add(recurso);
    }
    
    public void eliminarRecurso(Recurso recurso){
        recursosDisponibles.remove(recurso);
    }
    
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void eliminarUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }
    
    public void prestarLibro(Recurso recurso, Usuario usuario, Fecha fecha){
        recurso.setDisponible(false);
        recurso.setFechaPrestamo(fecha);
        usuario.getLibrosPrestados().add(recurso);
    }
    
    public void devolverLibro(Recurso recurso, Usuario usuario, Fecha fecha){
        recurso.setDisponible(true);
        recurso.setFechaPrestamo(null);
        usuario.getLibrosPrestados().remove(recurso);
    }
    
    @Override
    public String toString() {
        return "Biblioteca{" + "recursosDisponibles=" + recursosDisponibles + ", usuarios=" + usuarios + ", librosPrestados=" + librosPrestados + '}';
    }
    
    
}
