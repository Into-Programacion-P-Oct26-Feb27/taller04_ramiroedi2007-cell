/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreCliente;
        double netflix;
        double ytp;
        double dropbox;
        double spotify;
        double netflixDescont;
        double ytpDescont;
        double dropboxDescont;
        double spotifyDescont;
        double valorDesnf;
        double valorDesytp;
        double valorDesdrop;
        double valorspot;
        double costoMensual;
        double ahorroMensual;
        double valorTotal;
                
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese el valor Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor Youtube Premium");
        ytp = entrada.nextDouble();
        System.out.println("Ingrese el valor de Dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor de la Spotify");
        spotify = entrada.nextDouble();
        
        costoMensual = netflix + ytp + dropbox + spotify; 
        
        netflixDescont = 0.23 * netflix;
        ytpDescont = 0.23 * ytp;
        dropboxDescont = 0.45 * dropbox;
        spotifyDescont = spotify;
        
        valorDesnf = netflix- netflixDescont;
        valorDesytp = ytp - ytpDescont;
        valorDesdrop = dropbox - dropboxDescont;
        valorspot = spotify;
        
        ahorroMensual = netflixDescont + ytpDescont + dropboxDescont + spotifyDescont;
        valorTotal = valorDesnf + valorDesytp + valorDesdrop + valorspot;
        
        System.out.printf("Nombre cliente: %s\n"
                + "Valor de descuento de netflix: $%.2f"
                + "\nValor de descuento de Youtube Premium: $%.2f\n"
                + "Valor de descuento de Dropbox: $%.2f\n"
                + "Valor de descuento de Spotify: $%.2f\n"
                + "Precio final de Netflix: $%.2f\n"
                + "Precio final de Youtube Premium: $%.2f\n"
                + "Precio final de Dropbox: $%.2f\n"
                + "Precion final de Spotify: $%.2f\n"
                + "EL costo mensual de los serivicios sin descuentos es: $%.2f\n"
                + "El ahorro mensual del cliente: $%.2f\n"
                + "El valor total despues de apllicar las promociones: $%.2f\n",
                nombreCliente,
                netflixDescont,
                ytpDescont,
                dropboxDescont,
                spotifyDescont,
                valorDesnf,
                valorDesytp,
                valorDesdrop,
                valorspot,
                costoMensual,
                ahorroMensual,
                valorTotal);
    }
    
}
