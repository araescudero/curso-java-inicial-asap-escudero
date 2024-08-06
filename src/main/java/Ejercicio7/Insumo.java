package Ejercicio7;


public class Insumo implements Facturable {
    private int id;
    private String nombre;
    private TipoInsumo tipo;
    private double porcGanancia;
    private double precioLista;

    public Insumo(int id, String nombre, TipoInsumo tipo, double porcGanancia, double precioLista){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcGanancia = porcGanancia;
        this.precioLista = precioLista;
    }

    public TipoInsumo getTipo(){
        return tipo;
    }

    @Override
    public double getMontoFacturacion() {
        return 0;
    }
}
