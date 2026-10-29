/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreTitular;
        String nombreDireccion;
        double costoMinuto = 1.50;
        double minutosConsu;
        double totalPagar;
        
        System.out.println("Ingrese su nombre");
        nombreTitular = entrada.nextLine();
        System.out.println("Ingrese su direccion");
        nombreDireccion = entrada.nextLine();
        System.out.println("Ingrese los minutos consumidos");
        minutosConsu = entrada.nextDouble();
        
        totalPagar = (costoMinuto * minutosConsu);
        
        System.out.printf("============================\nPLANILLA DE SERVICIO TELEFONICO"
                + "\n===================================\nTitular: %s\n"
                + "Direccion: %s\n----------------------\n"
                + "Costo por minuto: %s\n"
                + "Minutos consumidos %s\n-------------------\n"
                + "VALOR TOTAL A PAGAR: %s\n==========================" , nombreTitular,
                nombreDireccion,
                costoMinuto,
                minutosConsu,
                totalPagar);
    }
    
}
