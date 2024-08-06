package Ejercicio6;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa (){
        empleados = new ArrayList<>();
    }

    public void mostrarSalarios(){
        for (Empleado empleado : empleados){
            System.out.printf("%s: $%.2f%n", empleado.getNombreCompleto(), empleado.mostrarSalario());
        }
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public EmpleadoComision empleadoConMasClientes(){
        EmpleadoComision empleadoMasClientes = null;
        int maxClientes = 0;

        for(Empleado empleado : empleados){
            if (empleado instanceof EmpleadoComision){
                EmpleadoComision empComision = (EmpleadoComision) empleado;
                if (empComision.getClientesCaptados() > maxClientes){
                    maxClientes = empComision.getClientesCaptados();
                    empleadoMasClientes = empComision;
                }
            }
        }
        return empleadoMasClientes;
    }
}
