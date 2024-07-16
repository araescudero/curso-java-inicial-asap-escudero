package clase4;
import com.github.sanchezih.util.io.Consola;

/**
Ejercicio02
Programa que genera un array de 8 enteros aleatorios entre 1 y 10, lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo muestra.
 */


public class Ejercicio2 {

    public static void main(String[] args) {
        final int CANT_ELEMENTOS = 8;
        int array[] = new int[CANT_ELEMENTOS];

        // Almacenar en un array números aleatorios entre 1 y 10
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(array);

        // Ordenar el array utilizando el algoritmo de ordenamiento de burbuja
        ordBurbuja(array);

        // Mostrar el array ordenado
        System.out.println("\nArray ordenado:");
        mostrarArray(array);
    }

    	// Función para mostrar un array
    	public static void mostrarArray(int[] array) {
    		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
    		}
    	}

    	// Función para ordenar un array utilizando el algoritmo de ordenamiento de burbuja
    	public static int[] ordBurbuja(int[] array) {
    		int aux;
    		for (int i =0; i < array.length; i++) {
    			for (int j = 0; j < array.length -i -1; j++) {
    				if (array [j] > array[j+1]);
    				aux = array[j];
    				array[j] = array [j+1];
    				array [j+1] = aux;
    			}
    		}
    		return array;
    	}
    	
}
