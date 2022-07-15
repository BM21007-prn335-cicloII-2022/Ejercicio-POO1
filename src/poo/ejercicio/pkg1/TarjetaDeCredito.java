/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio.pkg1;

/**
 *
 * @author Angel
 */
public class TarjetaDeCredito {

    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String numeroDeTarjeta;
    private double saldoDisponible;
    private Persona persona;

    public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, String numeroDeTarjeta, double saldoDisponible, Persona persona) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.persona = persona;
    }

    public boolean tieneSaldoDisponible(double montoARetirar) {
        return false;
    }
    
    public void descontar(double montoARetirar) {}
    
    public String nombreCompletoPersona(){
        return "";
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadFinanciera=" + entidadFinanciera + ", entidadBancaria=" + entidadBancaria + ", numeroDeTarjeta=" + numeroDeTarjeta + ", saldoDisponible=" + saldoDisponible + ", persona=" + persona + '}';
    }

    
    
}
