/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreProject1;
        String nombreProject2;
        String nombreProject3;
        double precioProject1;
        double precioProject2;
        double precioProject3;
        double gastoTotal;
        
        System.out.println("Ingrese nombre del proyecto1:");
        nombreProject1 = entrada.nextLine();
        System.out.println("Ingrese nombre del proyecto 2:");
        nombreProject2 = entrada.nextLine();
        System.out.println("Ingrese nombre del proyecto 3:");
        nombreProject3 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual del Proyecto 1");
        precioProject1 = entrada.nextDouble();
        System.out.println("Ingrese el gasto mensual del Proyecto 2");
        precioProject2 = entrada.nextDouble();
        System.out.println("Ingrese el gasto mensual del Proyecto 3");
        precioProject3 = entrada.nextDouble();
        gastoTotal = (precioProject1 + precioProject2 + precioProject3 );
        
        System.out.printf("Control de gastos de proyectos \nProyectos:\n---------------\n"
                + "1.%s : $%s\n "
                + "2.%s : $%s\n"
                + "3.%s : $%s \n---------------\nGasto Mensual Total: $%s\n",
                nombreProject1,
                precioProject1,
                nombreProject2,
                precioProject2,
                nombreProject3,
                precioProject3,
                gastoTotal);
    }
    
}
