package com.borjarnau.losanimales.pojo;

/**
 * Created by ArnAu on 20/05/2016.
 */
public class Mascota {

    private int foto;
    private String nombre;
    private int numMegustas = 0;



    public Mascota(int foto, String nombre, int numMegustas) {
        this.foto = foto;
        this.nombre = nombre;
        this.numMegustas = numMegustas;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumMegustas() {
        return numMegustas;
    }

    public void setNumMegustas(int numMegustas) {
        this.numMegustas = numMegustas;
    }


}


