/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uniajc;

/**
 *
 * @author g.perezmoreno
 */
public class EjercicioHerencia411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final float SALDO = 15000;
        final float TASA = 0.1f;
        
        CuentaAhorros ahorro = new CuentaAhorros(SALDO, TASA);
        
        System.out.println("");
        
        ahorro.imprimir();
        ahorro.consignar(5000);
        
        System.out.println("");
        ahorro.imprimir();
        
        ahorro.retirar(2000);
        ahorro.retirar(500);
        ahorro.retirar(1000);
        ahorro.retirar(500);
        
        System.out.println("");
        ahorro.imprimir();
        
        System.out.println("");
        ahorro.extractoMensual();  
        
        System.out.println("");
        ahorro.imprimir();
        
        
        ahorro.retirar(1000);
        
        System.out.println("");
        ahorro.extractoMensual();  
        
        System.out.println("");
        ahorro.imprimir();
        
        CuentaCorriente co = new CuentaCorriente(SALDO, TASA);
    } 
}
