package fechas;

import java.time.LocalDate;

public class UtilidadesFecha {
    public static void main(String[] args) {
        
        LocalDate fecha = LocalDate.now();
        System.out.println(diasMes(fecha));
    }

    // Creamos el metodo bisiesto para saber si la fecha lo es o no.
    public static boolean bisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }
    //Creamos una copia de la fecha.
    /*public static LocalDate copia(LocalDate fecha) {
        LocalDate copia1 ;

        return copia1;
    }
        */
    //Devolver el numero de dias que tiene el mes de la fecha.
    public static int  diasMes(LocalDate fecha){

        return fecha.getDayOfMonth();

    }
    public static int diaSemana(){
        
        return;
    }
}
