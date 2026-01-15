/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------------------");
        //Creacion de Animal con constructor por defecto.
        Animal animal2 = new Animal();
        System.out.println(animal2);
        Animal animal1 = new Animal(Estado.JUGANDO, TipoAnimal.GATO, LocalDate.MIN, "Diego", "base");
        System.out.println("-------------------------------");
        System.out.println(animal1);

    }
}
