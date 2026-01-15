package daw;

public class Main {
    public static void main(String[] args) {
        // Venta v1 = new Venta("AgriculturaEstepona", "Fina", "Picual",100, 200.34);
        Estudiante estudiante1 = new Estudiante("Diego", 123, "Primero");
        Estudiante estudiante2 = new Estudiante("Paco", 1222, "Segundo");

        estudiante1.setNotaMedia(7);//Modificamos la nota en el set ya que el atributo en la clase Estudiante es 0.0
        System.out.println(estudiante1);
        System.out.println(estudiante2.toString());
         
    }
}