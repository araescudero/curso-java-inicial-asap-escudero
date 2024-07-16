/**
Ejercicio02
Programa que pide 10 numeros por teclado, los almacena en un array y que luego muestra el maximo valor, el minimo y las posiciones que ocupan en el array.
 */



package clase3;
import com.github.sanchezih.util.io.Consola;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int CANT_ELEMENTOS = 10;
		int array [] = new int [CANT_ELEMENTOS]; // Tamaño del array.
		int numero = 0, posMayor =0, posMenor = 0;
		int mayor, menor;
		mayor = menor = array [0];
		
		// Ingreso de números por el usuario que se almacenan en el array.
		
		for (int i =0; i< array.length; i++) {
			System.out.print("Ingrese número " + (i+1) +":");
			array [i] = Consola.leerEntero();				
		}
		
		// Recorre comprobando si el elemento del array es menor o mayor a lo almacenado en la variable. En caso de cumplirse la condición lo reemplaza.
		// Guarda en la variable pos la posición del menor y mayor elemento.
		
		for (int i = 0; i < array.length; i++) {
			if(array [i] > mayor) {
				mayor = array [i];
				posMayor = i;
			}
			if (array[i]< menor) {
				menor = array [i];
				posMenor = i;
			}
			
		}
		
		System.out.println ("El mayor valor es: " + mayor + ", se encuentra en la posición: " + (posMayor +1));
		System.out.println ("El mayor valor es: " + menor +  ", se encuentra en la posición: " + (posMenor +1));	
	
	}

}
