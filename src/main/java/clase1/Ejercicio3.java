/**
El programa lee por teclado una calificacion numerica entre 0 y 10 y muestra por pantalla su correspondiente calificacion alfabetica.

La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:

0 <= nota < 5 Insuficiente
5 <= nota < 6 Suficiente
6 <= nota < 7 Bien
7 <= nota < 9 Notable
9 <= nota <= 10 Sobresaliente

La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10 para poder obtener su equivalente calificacion alfabetica. Si la calificacion introducida no es valida se muestra un mensaje indicandolo y el programa finaliza.
*/

package clase1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese una calificación númerica entre 0 y 10: ");
		int nota = entrada.nextInt ();
		String calificacion; 
		
		if (nota < 0 || nota > 10) {
			System.out.println ("La calificación es ivalida");
		} else {
			if (nota < 5) {
			calificacion = "Insuficiente";
			} else if (nota < 6) {
				calificacion = "Suficiente";
			} else if (nota <7) {
				calificacion = "Bien";
			} else if (nota <9) {
				calificacion = "Notable";
			} else {
				calificacion = "Sobresaliente";
			}
			
			System.out.println ("La calificación alfabética es: " + calificacion);
				
			
		}
				
			
		entrada.close();

	}
}