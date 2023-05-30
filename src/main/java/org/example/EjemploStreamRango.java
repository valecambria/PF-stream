package org.example;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRango {
    public static void main(String[] args) {
        IntStream numeros = IntStream.range(5, 20).peek(System.out::println);

        //int resultado = nombres.reduce(0, Integer::sum);
        //int resultado = numeros.sum();
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("maximo = " + stats.getMax());
        System.out.println("minimo = " + stats.getMin());
        System.out.println("suma = " + stats.getSum());
        System.out.println("promedio = " + stats.getAverage());


    }
}
