/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreCliente;
        double cPU ;
        double teclado;
        double raton;
        double pantalla;
        double costoBase;
        double porcentajeOperacional = 0.15;
        double costoFinal;
        
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese el valor de la CPU");
        cPU = entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el valor de Raton");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el valor de la pantalla");
        pantalla = entrada.nextDouble();
        
        costoBase = cPU + teclado + raton + pantalla ;
        costoFinal = porcentajeOperacional * costoBase;
        
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
