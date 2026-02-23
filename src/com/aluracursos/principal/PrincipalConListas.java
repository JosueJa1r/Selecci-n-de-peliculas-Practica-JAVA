package com.aluracursos.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas{
    static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2021);
        peliculaDeBruno.evalua(6);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(10);
        Serie casaDragon = new Serie("Casa Dragon", 2022);


        Pelicula p1 = miPelicula;

        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);
        lista.add(peliculaDeBruno);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if ( item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Valderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artista ordenada " +  listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista de Titulos Ordenados " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista Ordenada por Fecha: "+lista);
    }
}
