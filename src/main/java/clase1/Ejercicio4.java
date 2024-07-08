/** Ejercicio04
Programa que comprueba si un anio es bisiesto. Un anio es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.
 */

package clase1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el año a evaluar: ");
		
		int anio = entrada.nextInt();		        
		boolean Bisiesto = (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);
		
		if (Bisiesto) {
			System.out.println("El año " + anio + " es bisiesto.");
		} else {
			System.out.println("El año " + anio + " no es bisiesto.");
		}
		entrada.close();
	}
}
