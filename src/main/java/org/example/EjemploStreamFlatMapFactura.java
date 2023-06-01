package org.example;

import org.example.models.Factura;
import org.example.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("John", "Doe");
        Usuario usuario2 = new Usuario("Pepe", "Perez");
        usuario1.addFacturas(new Factura("Compras tecnologias"));
        usuario1.addFacturas(new Factura("Muebles"));
        usuario2.addFacturas(new Factura("Celular"));
        usuario2.addFacturas(new Factura("Notebook"));

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);
        usuarios.stream().flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente -> ").concat(f.getUsuario().toString())));

/*        for (Usuario u: usuarios){
            for (Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/

    }
}
