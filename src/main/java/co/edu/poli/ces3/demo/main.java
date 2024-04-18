package co.edu.poli.ces3.demo;

import java.util.Arrays;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        // Generar 10 números aleatorios
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100);  // Genera números aleatorios entre 0 y 99
        }

        // Imprimir el arreglo completo
        System.out.println("Arreglo completo:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Imprimir solo los números en posiciones pares
        System.out.println("Números en posiciones pares:");
        for (int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }
    }
}

