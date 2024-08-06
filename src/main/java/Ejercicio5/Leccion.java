package Ejercicio5;

public class Leccion {
    private String titulo;
    private int duracion; // en minutos

    public Leccion(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
}
