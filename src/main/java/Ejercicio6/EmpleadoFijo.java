package Ejercicio6;

import java.util.Calendar;

public class EmpleadoFijo extends Empleado {
	private double sueldoBasico;
	

    public EmpleadoFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
        
    }

    @Override
    public double mostrarSalario(){
        int aniosEnEmpresa = Calendar.getInstance().get(Calendar.YEAR) - anioIngreso;
        double porcentajeAdicional = 0;

        if(aniosEnEmpresa >= 2 && aniosEnEmpresa <= 5){
            porcentajeAdicional = 0.05;
        }
        else if (aniosEnEmpresa >= 6 && aniosEnEmpresa <= 10){
            porcentajeAdicional = 0.10;
        }
        else if (aniosEnEmpresa > 10) {
            porcentajeAdicional = 0.15;
        }

        return sueldoBasico * (1 + porcentajeAdicional);
    }

}
