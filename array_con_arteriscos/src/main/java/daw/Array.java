package daw;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static Random rd = new Random();
    public static Scanner sc = new Scanner(System.in);
//Prueba_1
    /*
     * Solicitar por consolar introducir en un array de 10 posiciones numeros del 1 al 5.(Random)
        En una Funcion a partir de un Array() Hay que devolver un Array, que tiene que llevar en cada una de las siguientes posiciones el numero total de cada numero que hay.¿Qué cantidad de numeros hay de todos los que tenemos en el array?
        Cuando llamemos al array en el Main, "El 1 e repite tres veces" (Ponemos ***), y Así todos los numeros.
     * 
     */
    public static void main(String[] args) {
        int[]arrayMain = array();
      
        for (int i : arrayMain) {
            System.out.print(i+" ");
        }
    }

    //Método para rellenar un Array.
    public static int[] array() {
        int[] array1 = new int[10];
        // Rellenamos el array por consola
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un valor del 1 al 5: ");
            array1[i] = sc.nextInt();

        }
        return array1;
    }
    //Contador de *
    //[1,1,2,2,3,3,4,5,5,5];
    public static int[] contador(int[]array){
        //Nuevo array 
        int[]arrayContador = new int[5];
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]=array[i]) {
                
            }
        }

        return arrayContador;
    }
}
