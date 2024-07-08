
/**
Ejercicio01
Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o de 3. */

package clase1;
import java.util.Scanner;


public class Ejercicio1 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduce un numero entero:");		
		int numero = entrada.nextInt();
		
		boolean esMultiploDe2 = (numero % 2 ==0);
		boolean esMultiploDe3 = (numero % 3 ==0);

		if (esMultiploDe2 && esMultiploDe3) {
			System.out.println(numero +" es multiplo de 2 y 3");
		} else if (esMultiploDe2){
			System.out.println(numero + " es multiplo de 2");
		} else if (esMultiploDe3){
			System.out.println(numero + " es multiplo de 3");	
		} else {
			System.out.println(numero + " no es multiplo de 2 ni de 3");
		}
		
		entrada.close();
	}
}
