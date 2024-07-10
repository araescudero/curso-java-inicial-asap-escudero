/**
 * Ejercicio03
El programa leera por teclado un numero entero positivo y calculara la suma de sus cifras.
Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus cifras es: 10".

 */

package clase2;
import com.github.sanchezih.util.io.Consola;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero;
		int sumaCifras = 0;
		
			do {
				numero = Consola.leerEntero("Ingrese un número positivo: "); //se ejecuta si o si una vez
			} while (numero<=0); //Verifica si el número es negativo. En caso de no serlo vuelve a solicitarlo.
				
	        
	        while (numero > 0) { //Calcula la suma de las cifras ingresadas
	            sumaCifras += numero % 10;
	            numero /= 10;
	        }
	        
	        System.out.println("La suma de las cifras del número ingresado es: " + sumaCifras); //Muestra el resultado
	    }
	}