/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3_fraseminmay;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejer3_FraseMinMay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("Frase en minuscula: " + frase.toLowerCase());
        System.out.println("Frase en mayuscula: " + frase.toUpperCase());
    }
    
}
