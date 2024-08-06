package Ejercicio6;

public class EmpleadoComision extends Empleado {
		private double salarioMinimo = 20000;
		private int clientesCaptados;
		private double montoPorCliente;

	    public EmpleadoComision(String dni, String nombre, String apellido, int anioIngreso,double salarioMinimo, int clientesCaptados, double montoPorCliente) {
	        super(dni, nombre, apellido, anioIngreso);
	        this.salarioMinimo = 18000;
	        this.clientesCaptados = clientesCaptados;
	        this.montoPorCliente = montoPorCliente;
	    }



	@Override
		public double mostrarSalario(){
			double salario = clientesCaptados * montoPorCliente;
			return Math.max(salario, salarioMinimo);
		}

		public int getClientesCaptados(){
			return clientesCaptados;
		}
		
}


