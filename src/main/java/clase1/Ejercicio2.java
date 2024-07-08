/**
Programa que pide por teclado la fecha de nacimiento de una persona (dia, mes, anio) y calcula su numero de la suerte.
El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y a continuacion sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es 12/07/1980
Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
Numero de la suerte: 28 */


package clase1;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el día de su nacimiento:");
		int dia =entrada.nextInt ();
		
		System.out.println("Ingrese el mes de su nacimiento:");
		int mes =entrada.nextInt ();
		
		System.out.println("Ingrese el anio de su nacimiento:");
		int anio =entrada.nextInt ();
		
		int SumaDeFecha = dia + mes + anio;
		int Cifras = Integer.toString(SumaDeFecha).length();
		int SumaDeCifras = 0;
		
		for (int i =0; i<Cifras; i++) {
			String num = String.valueOf(Integer.toString (SumaDeFecha).charAt(i));
			SumaDeCifras += Integer.parseInt(num);
		}
		System.out.println ("Su número de la suerte es: " + SumaDeCifras);
		
					
		entrada.close();
	}

}
