package tarea4ediego;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int opcion = 0;
        do {
            System.out.println("Qué  opción desean elegir: (4.-Sale))");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Primer caso. Generar núm pin aleatorios
                    // Hay que crear un array e introducir cuatro digitos aleatorios.
                    int[] clave = new int[4];
                    for (int i = 0; i < clave.length; i++) {
                        clave[i] = rd.nextInt(0, 10);
                    }
                    break;
                // Segundo caso. Crear un Array de tipo char o String.
                // Para introducir caracteres.
                case 2:
                    String[] array = new String[8];
                    //Hay que controlar la entrada de datos.
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Introduce un caracter para la contraseña:");
                        String caracter = sc.nextLine();
                        array[i] = caracter;
                    }
                    break;
                //Generar una secuencia de "n" caracteres aleatorios de un conjunto que tú elijas.
                //Hay que rellenar un array de String tamaño que yo quiera.  
                // Después un Random que saque aleatoriamente una posición del array.
                case 3:
                    break;

            }

        } while (opcion != 4);
    }
}