package Ejercicio8;

public class Vehiculo {
    private String patente;
    private String marca;
    private int cilindrada;

    public Vehiculo(String patente, String marca, int cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
    
    public String getPatente() {
    	return patente;
    }
    
    public String getMarca() {
    	return marca;
    }
    
    public int getCilindrada() {
    	return cilindrada;
    }
    
}
