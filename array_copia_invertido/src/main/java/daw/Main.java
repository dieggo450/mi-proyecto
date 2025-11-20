package daw;

import java.util.Random;

public class Main {
    //Creamos un Random:
    public static Random rd = new Random();
    public static void main(String[] args) {
/*
Crear un  Array 
Hacer una copia de Array pero en otro espacio de memoria.
Mostrar un Array invertido
Funcion copiarInverso copia del original pero hacer de forma inversa.
ESTO ES LO QUE CAE EN EL EXAMEN:
-Crear funciones en la misma clase u otra clase, 
-Pasar parametro usar array coger con los indices
-(Random, excepciones. Leer por teclado, joption,...)	 
*/

//Creamos una variable que diga el tamaño del Array
int tamanio = rd.nextInt(5,11);//Le decimos que el tamaño será de 5 a 10.
    }
    //Creamos un método que use un Random para rellenar un Array.
    public static int[] rellenarArray(int tamanio){
        int[] array1 = new int[tamanio];//Creamos un Array y le pasamos el tamaño 
        for (int i = 0; i < array1.length; i++) {
            //Rellenamos el Array con enteros con un Random
            array1[i]= rd.nextInt(1,10);//Rellenamos el array con números entre 1-9.
        }
        return array1;
    }
}