package Ejercicio7;

public class ServicioDeReparacion extends Servicio{

    private static final double VALOR_HORA = 500;
    private static final int INCR_DIF = 25;
    private static final int MIN_DIFIC = 3;
    private static final int LIMITE_DE_SIMPLEZA = 2;

    private int dificultad;

    public ServicioDeReparacion(String nombre, int cantHoras){
        super(nombre, cantHoras);
        this.dificultad = dificultad;
    }

    //@Override
    //public double getPrecio() {
    //    double precioBase = super.getPrecio();
    //    return this.dificultad > MIN_DIFIC ? Matematica.sumarPorcentaje(precioBase, INCR_DIF) : precioBase;
    //}

    @Override
    public double getValorHora() {
        return VALOR_HORA;
    }

    public boolean esServicioSimple() {
        return this.dificultad < LIMITE_DE_SIMPLEZA;
    }
}
