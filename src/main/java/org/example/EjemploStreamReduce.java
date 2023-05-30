package org.example;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();

        String resultado = nombres.reduce("resultado = ", (a,b) -> a + "," + b);
        System.out.println(resultado);


    }
}
