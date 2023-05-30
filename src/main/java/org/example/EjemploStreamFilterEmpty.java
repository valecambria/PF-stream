package org.example;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        long count = Stream.of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena", "Pepe Garcia", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println(count);


    }
}
