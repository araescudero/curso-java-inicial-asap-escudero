/**
Ejercicio03
Programa que pide 5 numeros enteros, los almacena en un array, e indica por pantalla si dicho array es capicua.
*/



package clase3;
import com.github.sanchezih.util.io.Consola;


public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaración de variables y creación del array
		
		int array[];
		int inicio =0, fin;
		boolean capicua = true;		
		array = new int[5];
		
		// Solicita los números al usuario y almacenar en el array
		for (int i =0; i< array.length; i++) {
			System.out.print("Ingrese número " + (i+1) +":");
			array [i] = Consola.leerEntero();
		}
		
		// Se inicializa la variable fin como el ultimo indice del array.
		fin = array.length - 1;
		
		//Mientras que el inicio sea menor al fin y capicua devuelve true.
		//Si el inicio y el fin no son iguales, capicua devuelve false.
		// Con cada comparación inicio se incrementa y fin se decrementa.
		
		while(inicio <= fin && capicua) {
			capicua = (array[inicio++] == array[fin--]);
		}
		
		//Muestra el resultado.
		
		if(capicua)
			System.out.println("El array es capicua");
		else
			System.out.println("El array NO es capicua");
	

		}
		
}


