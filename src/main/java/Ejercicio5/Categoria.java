package Ejercicio5;

public class Categoria {
    private int categoriaId;
    private String nombre;

    public Categoria(int categoriaId, String nombre) {
        this.categoriaId = categoriaId;
        this.nombre = nombre;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public String getNombre() {
        return nombre;
    }
}
