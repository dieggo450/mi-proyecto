package modelo;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Animal {

    Estado estado;
    TipoAnimal tipo;

    private LocalDate fechaNacimiento;
    private String nombre;
    private Double peso = 10.00;
    private String estadoInicial = "reposo";
    private String tipoBase;

    //Creamos el constructor por defecto:(Le ponemos los valores de inicio que queramos)
    public Animal() {
        this.fechaNacimiento = LocalDate.of(2000, 01, 01);
        this.nombre = "gato";
        this.peso = 10.00;
        this.estado = Estado.REPOSANDO;
        this.tipo = TipoAnimal.COBAYA;
    }

    public Animal(Estado estado, TipoAnimal tipo, LocalDate fechaNacimiento, String nombre, String tipoBase) {
        this.estado = estado;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipoBase = tipoBase;
    }
    

    //Constructor parametrizado:
    public Animal(LocalDate fechaNacimiento, String nombre, String tipoBase, double peso, String estadoInicial) {
        //Si la fecha de nacimiento es "Anterior" a la fecha de 200/01/01 Lanza excepción
        if (fechaNacimiento.isBefore(LocalDate.of(2000, 01, 01))) {
            throw new IllegalArgumentException("La fecha introducida no es válida.");

        } else if (fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("No puede introducir una fecha superior a hoy.");
        }

        if (peso < 10 || peso > 100000) {
            throw new IllegalArgumentException("El peso introducido no es correcto");
            //Creamos otra excepción para que el peso no sea negativo.
        } else if (peso < 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo");
        }

        //Si no hay ninguna excepci
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.peso = peso;
        this.estado = estado;
    }

    public Animal(LocalDate fechaNacimiento, String nombre, Double peso, String estadoInicial) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.peso = peso;
        this.estadoInicial = estadoInicial;
    }

    //Constructor copia crea una copia del animal creado
    public Animal(Animal a) {
        if (a == null) {
            throw new IllegalArgumentException("Error, esta null");
        }
        this.estadoInicial = a.estadoInicial;
        this.fechaNacimiento = a.fechaNacimiento;
        this.nombre = a.nombre;
        this.peso = a.peso;
        this.tipoBase = a.tipoBase;
    }

    //Metodo comer.
    public void comer(double cantidadGramos) {
        setEstadoInicial("comiendo");
        this.peso += Math.abs(cantidadGramos);
    }
//La diferencia ahora esta enque al crear los metodos que llaman el enum, no se necesita del set para modificarlo,
    //Basta con llamar al Enum y darle un valor.
    //Metodo que pone a dormir.

    public void dormir() {
        this.estado = Estado.DURMIENDO;
    }

    //Metodo despertar
    public void despertar() {
        setEstadoInicial("reposando");
    }

    //Metodo descansar
    public void descansar() {
        this.estado = estado.REPOSANDO;
    }

    //Clonar animal 
    public static Animal clonar(Animal animal) {
        return new Animal(animal);
        //Se controla en la copia si es null.
    }

    //Metodo jugar
    public void jugar(int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos);
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("La mascota no puede mas.");
        }
        if (cantidadMinutos < 30) {
            this.peso *= 0.9;

        } else {
            int bloquesTreintaMinutos = cantidadMinutos / 30;
            this.peso *= (0.8 * bloquesTreintaMinutos);
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    @Override
    public String toString() {
        return "Animal{" + "estado=" + estado + ", tipo=" + tipo + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", peso=" + peso + ", estadoInicial=" + estadoInicial + ", tipoBase=" + tipoBase + '}';
    }

    

}
