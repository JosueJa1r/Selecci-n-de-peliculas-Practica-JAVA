package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;

    public int getTotalIsualizaciones() {
        return totalIsualizaciones;
    }

    public void setTotalIsualizaciones(int totalIsualizaciones) {
        this.totalIsualizaciones = totalIsualizaciones;
    }

    private int totalIsualizaciones;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalIsualizaciones > 100) {
            return 4;
        }else  {
            return 2;
        }
    }
}
