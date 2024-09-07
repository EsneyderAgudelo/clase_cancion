package com.example;

public class Main {
    public static void main(String[] args) {
        cancion cancion1 = new cancion();
        cancion1.mostrarInformacion();
        System.out.println();

        cancion cancion2 = new cancion("Tratado de paz", "Arcangel", 260);
        cancion2.setGenero("Regueton");
        cancion2.setAlbum("Arcangel");


        cancion2.mostrarInformacion();
        System.out.println();
        cancion2.mostrarInformacion("Julian Esneyder");
    }
}