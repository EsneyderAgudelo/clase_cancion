package com.example;

public class cancion {
    private String titulo;
    private String artista;
    private int duracion;
    private String genero;
    private String album;

    private static final int SEGUNDOS_POR_MINUTO = 60;


    public cancion() {
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }

    public cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }
    
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private int calcularDuracionMinutos() {
        return duracion / SEGUNDOS_POR_MINUTO;
    }

    
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion + " segundos (" + calcularDuracionMinutos() + " minutos)");
        System.out.println("Género: " + genero);
        System.out.println("Álbum: " + album);
    }

    public void mostrarInformacion(String usuario) {
        mostrarInformacion();  
        System.out.println("Esta canción está siendo escuchada por: " + usuario);
    }

    
}

