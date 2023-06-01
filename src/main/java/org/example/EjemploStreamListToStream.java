package org.example;

import org.example.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres", "Guzman"));
        lista.add(new Usuario("Luci", "Martinez"));
        lista.add(new Usuario("Pepe", "Fernandez"));
        lista.add(new Usuario("Cata", "Perez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("Bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }else{
                        return Stream.empty();
                    }
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(nombres.count());
    }
}
