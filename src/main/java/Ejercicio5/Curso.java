package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    public static final int MAX_BECADOS = 5;
    private int cursoId;
    private String titulo;
    private double precio;
    private int valoracion;
    private Usuario autor;
    private List<Usuario> suscriptos;
    private List<Usuario> becados;
    private List<Leccion> lecciones;

    public Curso(int id, String titulo, double precio, int valoracion, Usuario autor) {
        this.cursoId = id;
        this.titulo = titulo;
        this.precio = precio;
        this.valoracion = valoracion;
        this.autor = autor;
        this.suscriptos = new ArrayList<>();
        this.becados = new ArrayList<>();
        this.lecciones = new ArrayList<>();
    }

    public int getCursoId() {
        return cursoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getValoracion() {
        return valoracion;
    }

    public Usuario getAutor() {
        return autor;
    }

    public List<Usuario> getSuscriptos() {
        return suscriptos;
    }

    public List<Usuario> getBecados() {
        return becados;
    }

    public List<Leccion> getLecciones() {
        return lecciones;
    }

    public boolean estaSuscripto(Usuario usuario) {
        return suscriptos.contains(usuario);
    }

    public void suscribir(Usuario usuario) {
        suscriptos.add(usuario);
    }

    public boolean cuposBecadosLleno() {
        int becadosSuscritos = 0;
        for (Usuario suscriptor : suscriptos) {
            if (suscriptor.isEsBecado()) {
                becadosSuscritos++;
            }
        }
        return becadosSuscritos == MAX_BECADOS;
    }
}
