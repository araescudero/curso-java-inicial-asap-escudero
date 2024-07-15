/**
 * Ejercicio01
Programa que lee la altura de N personas y calcula:
La altura media.
Cuantas personas tienen una altura superior a la media.
Cuantas tienen una altura inferior a la media.
 
El valor de N se pide por teclado y debe ser entero positivo.
 */


package clase3;
import com.github.sanchezih.util.io.Consola;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n, mayorMedia = 0, menorMedia =0;
		double sumaAlturas = 0, alturaMedia;
		
        // Solicita el valor de n por teclado hasta que el mismo sea un entero positivo.
		
	     do {
	         System.out.print("Introduce el número de personas: ");
	         n = Consola.leerEntero();
	         if (n <= 0) {
	                System.out.println(" Debe ingresar un entero positivo. Ingrese el número nuevamente.");
	            }
	        } while (n <= 0);
	     
	     // Array donde se guarda las alturas ingresadas en centimetros.
	     
	     double[] alturas = new double[n];
	     
	     for (int i = 0; i < n; i++) {
	            System.out.print("Introduce la altura de la persona " + (i + 1) + " (en centimetros): ");
	            alturas[i] = Consola.leerDouble();
	            sumaAlturas += alturas[i];
	        }
	     
	     // Calculo de altura media.
	     
	     alturaMedia = sumaAlturas/n;
	     System.out.printf("Altura media: %.2f metros\n", alturaMedia);
	     
	     // Contar cuántas personas tienen una altura superior e inferior a la media
	        for (double altura : alturas) {
	            if (altura > alturaMedia) {
	                mayorMedia++;
	            } else if (altura < alturaMedia) {
	                menorMedia++;
	            }
	        }
	         
	     // Resultados.	        
	        
	        System.out.println("Personas con altura superior a la media: " + mayorMedia);
	        System.out.println("Personas con altura inferior a la media: " + menorMedia);
	}
}

