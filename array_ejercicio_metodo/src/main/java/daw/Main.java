package daw;

import java.util.Random;

public class Main {
    private static Random rd = new Random();

    public static void main(String[] args) {
        // 7.-Crear una funcion que devuelva un array de tamaño especificado en el
        // parametro con número aleatorios entre 1 y 33
        // 8.-Función que recibe un array de números
        // (array del paso 7) y devuelve un nuevo
        // array sin duplicados
        // Main -> 7 y 8

        int tamanio = rd.nextInt(5, 20);

        // Para mostrar el metodo voy a comparar un nuevo array al Array del método.
        int[] arrayMostrar = arrayMetodo(tamanio);
        // Mostramos el Array
        for (int i = 0; i < arrayMostrar.length; i++) {
            System.out.println(arrayMostrar[i]);
        }
        // Segunda opción para mostrar el Array a través de un for each.
        for (int n : arrayMostrar) {
            System.out.print(n + " ");
        }

    }

    public static int[] arrayMetodo(int tamanio) {

        int[] arrayCreado = new int[tamanio];
        for (int i = 0; i < arrayCreado.length; i++) {
            arrayCreado[i] = rd.nextInt(1, 31);
        }
        return arrayCreado;
    }

    public static int[] nuevoArray(int[] array) {
        int[] arrayModificado = new int[array.length];
        int[] sinCero;
        int variable = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayModificado.length; j++) {
                if (array[i] != arrayModificado[j]) {

                }
            }
        }

        return arrayModificado;
    }

    public static int encontrarDuplicados(int duplicado, int[] tamanioArray) {

        for (int i = 0; i < tamanioArray.length; i++) {
            if (duplicado == tamanioArray[i]) {
                return i;
            }
        }
        return -1;
    }
}
