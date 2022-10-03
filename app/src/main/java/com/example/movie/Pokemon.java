package com.example.movie;

import androidx.annotation.NonNull;

public class Pokemon {

    private String nombre;
    private int peso;
    private int altura;
    private String image;
    private String DetailsURL;

    public String getDetailsURL() {
        return DetailsURL;
    }

    public void setDetailsURL(String details) {
        DetailsURL = details;
    }


    /* public Pokemon(String nombre, int peso, int altura, String image) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.image = image;
    }
*/

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", image='" + image + '\'' +
                ", DetailsURL='" + DetailsURL + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
