package Ejercicio6;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar algunos empleados de ejemplo
        empresa.agregarEmpleado(new EmpleadoFijo("12345678", "Juan", "Pérez", 2015, 20000));
        empresa.agregarEmpleado(new EmpleadoFijo("23456789", "María", "García", 2010, 20000));
        empresa.agregarEmpleado(new EmpleadoComision("34567890", "Carlos", "López", 2018, 18000, 500, 5000));
        empresa.agregarEmpleado(new EmpleadoComision("45678901", "Ana", "Martínez", 2019, 1800, 600, 5000));

        System.out.println("Salarios de los empleados: ");
        empresa.mostrarSalarios();

        EmpleadoComision empMasClientes = empresa.empleadoConMasClientes();
        if (empMasClientes != null) {
            System.out.println("\nEmpleado con más clientes captados:");
            System.out.printf("%s: %d clientes%n", empMasClientes.getNombreCompleto(), empMasClientes.getClientesCaptados());
        } else {
            System.out.println("\nNo hay empleados a comisión registrados.");
        }
    }

}
