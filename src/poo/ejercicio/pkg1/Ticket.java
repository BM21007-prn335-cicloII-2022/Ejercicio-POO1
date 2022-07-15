/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio.pkg1;

/**
 *
 * @author Angel
 */
public class Ticket {
    private String nombreApellido;
    private double montototal;
    private double montoPorCadaCuota;

    public Ticket(String nombreApellido, double montototal, double montoPorCadaCuota) {
        this.nombreApellido = nombreApellido;
        this.montototal = montototal;
        this.montoPorCadaCuota = montoPorCadaCuota;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montototal=" + montototal + ", montoPorCadaCuota=" + montoPorCadaCuota + '}';
    }
    
    
}
