/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorequipo;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class VectorEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] vector = new String[8];
        for (int i = 1; i < 7; i++) {
            System.out.println("Escriba el nombre del compañero:" + i);
            vector[i]=leer.nextLine();
        }
        System.out.println("el nombre de los compañeros son:");
        for (int i = 1; i < 7; i++) {
            System.out.println(vector[i]);
        }
    }
    
}
