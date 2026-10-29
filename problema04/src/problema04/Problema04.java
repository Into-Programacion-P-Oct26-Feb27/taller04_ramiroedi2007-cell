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
        double costoAdicional;
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
        
        costoBase = (cPU + teclado + raton + pantalla) ;
        costoAdicional = (porcentajeOperacional * costoBase);
        costoFinal = (costoAdicional + costoBase);
        
        System.out.printf("Nombre cliente: %s\nValores: \nCPU: $%s\n"
                + "Teclado: $%s\nRaton: $%s\nPantalla: $%s\n\n"
                + "Costo base: $%s\nCosto adicional: %s\n"
                + "Costo final: $%s\n",
                nombreCliente,
                cPU,
                teclado,
                raton,
                pantalla,
                costoBase,
                costoAdicional,
                costoFinal);
    }
    
}
