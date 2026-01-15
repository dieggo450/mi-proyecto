package ex27novdiego;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej1 {
    // Creamos el Scanner para usarlo en toda la clase.

    public static void main(String[] args) {
        System.out.println(leerNum());
        // Leemos el metodo
        String[] ArrayPalabras = leerPalabras();
        for (int i = 0; i < ArrayPalabras.length; i++) {
            System.out.println(ArrayPalabras[i]);
        }

    }

    // Solicitamos un numero a través de JOption y si nos da un valor menor a 0 lo
    // solicitamos de nuevo.
    public static int leerNum() {
        int num = 0;
        // Creamos una variable que controle el bucle para que cuando sea num un numero
        // valido
        // Salga del bucle.
        boolean control = false;
        do {
            try {
                String solicitarNum = JOptionPane.showInputDialog("Ingrese un numero mayor que cero: ");
                num = Integer.parseInt(solicitarNum);
                //Controlamos a través de un condicional que sea un valor positivo 
                if (num > 0) {
                    control = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error, no ha introducido un numero: ");
            }

        } while (!control);
        return num;
    }

    // Creamos un metodo que devuelva un Array
    public static String[] leerPalabras() {
        Scanner sc = new Scanner(System.in);
        String[] lectura = new String[5];
        // Guardamos las palabras en cada posicion del Array
        for (int i = 0; i < lectura.length; i++) {
            System.out.println("Introduce una palabra: ");
            lectura[i] = sc.nextLine();
        }
        return lectura;
    }
    // Creamos un metodo al que se le pasa por parametro
    
      public static String[]rotarArray(int num, String[]array){
      String[] arrayPalabras = new String[array.length];
      
      
      return arrayPalabras;
     }
     
}
