/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio.pkg1;

/**
 *
 * @author Angel
 */
public class Posnet {

    private final double RECARGO_POR_CUOTA = 0.3;
    private final int MAX_CANTIDAD_DE_CUOTAS = 6;
    private final int MIN_CANTIDAD_DE_CUOTAS = 1;

    public Posnet() {
    }

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoParaAbonar, int cantidadDeCuotas) {
        Ticket ticket = null;
        double montoTotal;
        String nombreApellido = tarjeta.nombreCompletoPersona();
        double montoPorCuota;

        if (datosValidos(tarjeta, montoParaAbonar, cantidadDeCuotas)) {
            montoTotal = montoParaAbonar + (montoParaAbonar * recargoSegunCantidadDeCuotas(cantidadDeCuotas));
            if (tarjeta.tieneSaldoDisponible(montoTotal)) {
                tarjeta.descontar(montoTotal);
                montoPorCuota = montoTotal / cantidadDeCuotas;
                ticket = new Ticket(nombreApellido, montoTotal, montoPorCuota);
            }
        }
        return ticket;
    }

    private boolean datosValidos(TarjetaDeCredito tarjeta, double montoParaAbonar, int cantidadDeCuotas) {
        boolean tarjetaValida = tarjeta != null;
        boolean montoValido = montoParaAbonar > 0;
        boolean cantidadCuotasValidas = cantidadDeCuotas >= MIN_CANTIDAD_DE_CUOTAS && cantidadDeCuotas <= MAX_CANTIDAD_DE_CUOTAS;

        return tarjetaValida && montoValido && cantidadCuotasValidas;
    }

    private double recargoSegunCantidadDeCuotas(int cantidadDeCuotas) {
        return (cantidadDeCuotas - 1) * RECARGO_POR_CUOTA;
    }
}
