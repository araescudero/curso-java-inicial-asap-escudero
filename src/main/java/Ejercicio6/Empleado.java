package Ejercicio6;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    public int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public abstract double mostrarSalario();

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

}
