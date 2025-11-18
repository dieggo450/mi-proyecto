package daw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tipoOliva = new String[50];
        String[] sizeOliva = new String[50];
        String tipoOlivaLetra = " ";
        String size = " ";
        int kilos = 0;
        int[] cantidad = new int[50];
        double[] total = new double[50];
        boolean control = false;
        double precioFinal = 1.23;
        for (int i = 0; i < 50; i++) {
            //El primer dato a introducir en el Array será el tipo de oliva.
            do {
                System.out.println("Qué tipo de oliva quiere: picual, aloreña u hojiblanca. ");
                tipoOlivaLetra = sc.nextLine();
                if (tipoOlivaLetra.equals("salir")) {
                    control = true;
                    break;//Sale del do While
                } else if (tipoOlivaLetra.equals("picual") || tipoOlivaLetra.equals("aloreña") || tipoOlivaLetra.equals("hojiblanca")) {
                    tipoOliva[i] = tipoOlivaLetra;
                    control = true;
                    break;
                }

            } while (true);
            //Si queremos salir del bucle en este punto escribimos salir.
            if (tipoOlivaLetra.equals("salir")) {

                break;
            }

            //A continuación agregamos el Tamaño
            do {

                System.out.println("Qué tamaño de oliva quieres?: gruesa o fina ");
                size = sc.nextLine();
                if (size.equals("salir")) {
                    control = true;
                    break;

                } else if (size.equals("gruesa") || size.equals("fina")) {

                    sizeOliva[i] = size;
                    control = true;
                    break;
                }

            } while (true);
            if (size.equals("salir")) {

                break;
            }

            //Solicitamos la cantidad
            do {
                System.out.println("Cuántos kilos tienes?: ");

                try {
                    kilos = sc.nextInt();
                    sc.nextLine();//Para que no haya un salto de linea y no se repita la pregunta siguiente dos veces.
                } catch (NumberFormatException e) {
                    System.out.println("Has introducido mal los datos:");
                }

            } while (kilos <= 0);
            //Guardamos los kilos en el Array
            cantidad[i] = kilos;

            //Teniendo en cuenta los datos calculamos el total:
            switch (tipoOlivaLetra) {
                case "picual" -> {
                    precioFinal += (size.equals("gruesa")) ? 0.20 : 0.30;
                }
                case "aloreña" -> {
                    precioFinal += (size.equals("gruesa")) ? -0.15 : -0.30;
                }
                case "hojiblanca" -> {
                    precioFinal += (size.equals("gruesa")) ? 0.15 : -0.05;

                }

            }
            double precioTotal = precioFinal * kilos;
            total[i] = precioTotal;
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(tipoOliva[i] + ", " + sizeOliva[i] + ", " + cantidad[i] + ", " + total[i]);
        }

    }
}
