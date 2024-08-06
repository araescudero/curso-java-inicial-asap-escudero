package Ejercicio8;

public class ExamenDeAuto extends Examen {
    private static final int TIEMPO_MAXIMO_PERMITIDO = 90;
    private Auto auto;

    public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
        super(fecha, persona);
        this.circuitos.add(circuito);
        this.auto = auto;
    }

    @Override
    public boolean isAprobado() {
        Circuito circuito = circuitos.get(0);
        return circuito.isAprobado() && circuito.getTiempoEnSeg() <= TIEMPO_MAXIMO_PERMITIDO;
    }

    public int getTiempoDelCircuito(){
        return circuitos.get(0).getTiempoEnSeg();
    }
}
