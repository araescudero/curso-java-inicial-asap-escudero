package Ejercicio7;

public abstract class Servicio implements Facturable {
    private String nombre;
    public int cantHoras;

    public Servicio(String nombre, int cantHoras){
        this.nombre = nombre;
        this.cantHoras = cantHoras;
    }

    @Override
    public double getMontoFacturacion() {
        return 0;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public abstract  double getValorHora();

    public double calcularPrecio(){
        return this.cantHoras * getValorHora();
    };

    public double getPrecio() {
        return getCantHoras() * getValorHora();
    }
}
