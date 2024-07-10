/**
 *Ejercicio01
Programa que muestra los N primeros numeros de la serie de Fibonacci. El valor de N se lee por teclado.
La serie de fibonacci la forman una serie de numeros tales que: El primer termino de la serie es el numero 1. 
El segundo termino de la serie es el numero 1. Los siguientes terminos de la serie de fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…

 */

package clase2;
import com.github.sanchezih.util.io.Consola;

public class Ejercicio1 {
	public static void main(String[] args) {
		 
			int a = 1, b = 1, c, n; // Inicialización de variables de tipo entero
	        
	        System.out.print("Ingrese cantidad de elementos para la serie: "); //Solicita al usuario que ingrese un número
	        n = Consola.leerEntero();
	        	        
	        for (int i = 1; i <= n; i++) { // Itera desde 1 hasta el numero ingresado
	            System.out.print(a + ","); //imprime el numero actual de la serie comenzando por 1. Los divide por comas.
	            c = a + b; //calcula el siguiente número fibonacci
	            a = b; //actualiza el primer numero
	            b = c; //actualiza el segundo numero
	        }
	}

}
		
