package ej2;

import java.util.Random;

public class Ej2 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] arrayRandom = new int[20];// Creamos un Array de tamaño 20.

        // Rellenamos el Array de numeros aleatorios entre 0 y 5.
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = rd.nextInt(0, 6);
        }
        // Mostramos el resultado
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.println(arrayRandom[i]);
        }
        int[] arrayRelleno = arrayRandom;
       

        System.out.println("-------------------------------");
        Metodos.moverArray(arrayRelleno);

    }
}
