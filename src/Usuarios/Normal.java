/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Inventario.Fecha;
import Inventario.Recurso;
import java.util.ArrayList;

/**
 *
 * @author guillermo
 */
public class Normal extends Usuario{

    public Normal(String nombre, String claveUsuario, ArrayList<Recurso> librosPrestados, double deudaAcumulada) {
        super(nombre, claveUsuario, librosPrestados, deudaAcumulada);
    }
    
    public Normal(String nombre, String claveUsuario){
        super(nombre, claveUsuario);
    }
    
    @Override
    public double calcularDeuda(Fecha fechaActual){
        double deudaTotal = 0;
        for(int i = 0; i < librosPrestados.size(); i++){
            deudaTotal+=(fechaActual.getMes()-librosPrestados.get(i).getFechaPrestamo().getMes())*30*10+(fechaActual.getDia()-librosPrestados.get(i).getFechaPrestamo().getDia())*10;
        }
        deudaTotal+=deudaAcumulada;
        deudaAcumulada = deudaTotal;
        return deudaTotal;
    }
    
}
