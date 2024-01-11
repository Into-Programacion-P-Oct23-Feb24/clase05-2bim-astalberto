/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo08 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        // Ingresar por teclado el tamaño de un arreglo
        int tamanio;
        System.out.println("Ingrese el tamaño de un arreglo");
        tamanio = entrada.nextInt();
        int arreglo[] = new int[tamanio];

        // Ingresar por teclado los valores enteros del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese valores para el arreglo");
            arreglo[i] = entrada.nextInt();
        }

        // Sumar los valores del arreglo, mediante la función misterio
        System.out.printf("La suma es: %s\n",misterio(arreglo, tamanio));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
