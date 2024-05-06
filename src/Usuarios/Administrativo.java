/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Inventario.Recurso;
import java.util.ArrayList;
import Inventario.Fecha;

/**
 *
 * @author guillermo
 */
public class Administrativo extends Usuario {

    public Administrativo(String nombre, String claveUsuario, ArrayList<Recurso> librosPrestados, double deudaAcumulada) {
        super(nombre, claveUsuario, librosPrestados, deudaAcumulada);
    }
    public Administrativo(String nombre, String claveUsuario){
        super(nombre, claveUsuario);
    }
    @Override
    public double calcularDeuda(Fecha fechaActual){
        double deudaTotal = 0;
        for(int i = 0; i < librosPrestados.size(); i++){
            deudaTotal+=(fechaActual.getMes()-librosPrestados.get(i).getFechaPrestamo().getMes())*30*10+(fechaActual.getDia()-librosPrestados.get(i).getFechaPrestamo().getDia())*10;
        }
        deudaTotal*=.85;
        deudaTotal+=deudaAcumulada;
        deudaAcumulada = deudaTotal;
        return deudaTotal;
    }
    
}
