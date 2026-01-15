package ej2;

public class Metodos {

    public static void moverArray(int[] array) {
        int numero;

        int[] arrayMover = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                numero = array[i];
                if (numero > arrayMover[i]) {
                    numero = arrayMover[i];
                }
            }
        }
        for (int i = 0; i < arrayMover.length; i++) {
            System.out.println(arrayMover[i]);
        }
    }
}
