package daw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear una función que recibe un String, lo transforma en array de char y
        // devuelve si
        // Es un palindromo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();

        // Creamos un Array de tipo char, su tamaño será el tamaño de la palabra que
        // introduzca el usuario
        char[] laPalabra = palabra.toCharArray();
        for (Object elem : laPalabra) {
            System.out.print(elem);
        }

    }

    public static boolean palindromo(String palabra) {
        boolean resultado = false;
        char[] laPalabra = palabra.toCharArray();// Creamos el array sin inicializar
        int j = laPalabra.length - 1;
        for (int i = 0; i < j; i++) {
            if (laPalabra[i] != laPalabra[j]) {
                resultado = false;
                break;
            }
            j--;
        }
        /*
         * for (int i = 0; i < palabra.length(); i++) {
         * laPalabra[i] = palabra.charAt(i);
         * }//Agrega al array la plaabra dividiendola en letras.
         * // ¿Podría ser de tamaño "palabra"? palabra.lenght()
         * /*
         * for (int i = 0; i < laPalabra.length; i++) {
         * if (laPalabra[0] == laPalabra.length - 1) {
         * 
         * } else if (laPalabra[1] == laPalabra.length - 2) {
         * 
         * } else if (laPalabra[2] == laPalabra.length - 3) {
         * }
         * }
         */
        return resultado;
    }
}
