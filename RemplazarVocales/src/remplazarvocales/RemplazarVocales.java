/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remplazarvocales;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class RemplazarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lectura;
        String retorno;
        //String frase = "";
        //String fraseCod = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra, palabra o caracter");
        lectura = leer.nextLine();
        lectura = lectura.toLowerCase(); //toLowerCase es para pasar todo a minusculas
        retorno = nuevaCadena(lectura);
        //retorno= codificar(lectura)
        System.out.println(retorno);
    }

    public static String nuevaCadena(String palabra) {
        String nuevaCadena;
        nuevaCadena = palabra.replace('a', '@');
        nuevaCadena = nuevaCadena.replace('e', '#');
        nuevaCadena = nuevaCadena.replace('E', '#');
        nuevaCadena = nuevaCadena.replace('i', '$');
        nuevaCadena = nuevaCadena.replace('i', '$');
        nuevaCadena = nuevaCadena.replace('o', '%');
        nuevaCadena = nuevaCadena.replace('O', '%');
        nuevaCadena = nuevaCadena.replace('u', '*');
        nuevaCadena = nuevaCadena.replace('U', '*');
        return nuevaCadena;
    }

    //subprograma para codificar la frase
    public static String codificar(String lectura) {
        String vocales;
        String fraseCod;
        String caracterVocales;
        String caracterCadena;
        int cont;
        vocales = "aeiou"; //vocales sirve para recorrer la frase e identificar las coincidencias con las vocales que contiene
        fraseCod = "";

        for (int i = 1; i <= lectura.length(); i++) {
            cont = 0;
            caracterCadena = lectura.substring(i - 1, i);

            for (int j = 1; j <= vocales.length(); j++) {
                caracterVocales = vocales.substring(j - 1, j);
                if (caracterCadena.equals(caracterVocales)) {
                    cont = 1;
                    switch (caracterVocales) {
                        case "a":
                            fraseCod = (fraseCod.concat("@"));
                            break;
                        case "e":
                            fraseCod = (fraseCod.concat("#"));
                            break;
                        case "i":
                            fraseCod = (fraseCod.concat("$"));
                            break;
                        case "o":
                            fraseCod = (fraseCod.concat("%"));
                            break;
                        case "u":
                            fraseCod = (fraseCod.concat("*"));
                            break;

                        //caso contrario lo escriba tal cual es
                        default:
                            fraseCod = fraseCod + caracterCadena;
                    }
                }
            }
            if (cont == 0) {
                fraseCod = fraseCod.concat(caracterCadena);
            }
        }
        return fraseCod;

    }
}
