/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.ejercicio.pkg1;

/**
 *
 * @author Angel
 */
public class POOEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona persona1 = new Persona("34345432", "Juan", "Matias", "76589647", "juanmatias@gmail.com");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(EntidadFinanciera.BIRZA, "Banco social", "0001", 15000, persona1);
        
        
    }
    
}
