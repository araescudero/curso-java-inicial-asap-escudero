package Ejercicio8;

import java.util.ArrayList;
import java.util.List;

public abstract class Examen implements Evaluable  {
    private String fecha;
    private Persona persona;
    protected List<Circuito> circuitos;

    public Examen(String fecha, Persona persona) {
        this.fecha = fecha;
        this.persona = persona;
        this.circuitos = new ArrayList<>();
    }

    public List<Circuito> getCircuitos() {
        return circuitos;
    }

    public void agregarCircuito(Circuito circuito) {
        this.circuitos.add(circuito);
    }
}
