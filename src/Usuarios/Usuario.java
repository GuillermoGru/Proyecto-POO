/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.ArrayList;
import Inventario.*;
import Inventario.Tipos.*;
/**
 *
 * @author guillermo
 */
public abstract class Usuario implements Deuda{
    int nombre;
    int claveUsuario;
    ArrayList<Recurso> librosPrestados;
    double deudaAcumulada;

    public Usuario(int nombre, int claveUsuario, ArrayList<Recurso> librosPrestados, double deudaAcumulada) {
        this.nombre = nombre;
        this.claveUsuario = claveUsuario;
        this.librosPrestados = librosPrestados;
        this.deudaAcumulada = deudaAcumulada;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(int claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public ArrayList<Recurso> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Recurso> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public double getDeudaAcumulada() {
        return deudaAcumulada;
    }

    public void setDeudaAcumulada(double deudaAcumulada) {
        this.deudaAcumulada = deudaAcumulada;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", Clave de usuario = " + claveUsuario + ", Libros Prestados = " + librosPrestados + ", Deuda Acumulada = " + deudaAcumulada;
    }
    
    
    
    
    
}
