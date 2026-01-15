/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Persona {

    private String nombre;
    private int edad;

//constructor por defecto
    public Persona() {
    }

//Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = "defecto";
        this.edad = 30;//Al ser por defecto le ponemos los valores que queramos
    }
//Metodo to String

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    public void despertar(Animal pet) {
        
        pet.despertar();
    }

    //Alimenta al animal
    public void alimentar(Animal pet, int cantidadGramos) {
        if (pet != null) {
            pet.comer(cantidadGramos);
        }
    }

    //Jugar con el animal
    public void jugar(Animal pet, int cantidadMinutos) {
        if (pet == null) {
            return;
        }

        try {
            pet.jugar(cantidadMinutos);
        } catch (IllegalArgumentException e) {
            // Jugar el máximo permitido
            pet.jugar(180);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
