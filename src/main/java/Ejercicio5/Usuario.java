package Ejercicio5;

public class Usuario {
    private int usuarioId;
    private String nombre;
    private String email;
    private boolean esBecado;

    public Usuario(int id, String nombre, String email, boolean esBecado) {
        this.usuarioId = id;
        this.nombre = nombre;
        this.email = email;
        this.esBecado = esBecado;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEsBecado() {
        return esBecado;
    }
}
