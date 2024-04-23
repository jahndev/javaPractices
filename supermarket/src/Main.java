import supermarket.hipermaxi.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cajero pepe = new Cajero("Pepe", 1);

        Cliente clienteJahn = new Cliente("Jahn Arellano", 38, 95804914);

        Producto harinaDeTrigo = new Producto("Harina de Trigo 000",20);
        Producto mayonesa = new Producto("Mayonesa",15.45f);
        Producto jugoDeNaranja = new Producto("Jugo de Naranja",25.5f);
        Producto aceite = new Producto("Aceite de Jirasol",10.1f);
        Producto mapleHuevos = new Producto("Maple de Huevos (36u)",36);
        Producto queso = new Producto("Queso Menonita 1kg",30.5f);

        List<Producto>  listaDeProductosDeJahn = new ArrayList<>();

        listaDeProductosDeJahn.add(harinaDeTrigo);
        listaDeProductosDeJahn.add(mayonesa);
        listaDeProductosDeJahn.add(jugoDeNaranja);
        listaDeProductosDeJahn.add(aceite);
        listaDeProductosDeJahn.add(mapleHuevos);
        listaDeProductosDeJahn.add(queso);

        Compra compra = new Compra(clienteJahn, listaDeProductosDeJahn, pepe);

        String facturaDeJahn = compra.generarFactura();

        System.out.printf(facturaDeJahn);

    }
}