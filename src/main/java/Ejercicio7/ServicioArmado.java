package Ejercicio7;


public class ServicioArmado extends Servicio{
    private static final double VALOR_HORA = 250;

    public ServicioArmado(String nombre, int cantHoras){
        super(nombre, cantHoras);
    }

    @Override
    public double getValorHora() {
        return VALOR_HORA;
    }

}
