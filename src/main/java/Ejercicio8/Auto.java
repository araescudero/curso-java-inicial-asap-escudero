package Ejercicio8;

public class Auto extends Vehiculo{
    private int cantidadPuertas;

    public Auto(String patente, String marca, int cilindrada, int cantidadPuertas){
        super(patente, marca, cilindrada);
        this.cantidadPuertas = cantidadPuertas;

    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
}
