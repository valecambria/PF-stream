package org.example;

import org.example.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(nom -> {
                    if(nom.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(nom);
                    }
                    return Stream.empty();
                }) //el flatmap devuelve varias salidas, por cada elemento devuelve un stream separado
                .peek(System.out::println);
        System.out.println(nombres.count());
     //nombres.forEach(System.out::println);
    }
}
