package clase4;
import com.github.sanchezih.util.io.Consola;

/**
Ejercicio01
Programa que pide el ingreso de un numero e indica si es un numero primo o no.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int n, i = 1, c = 0;
		
        System.out.print("Ingrese un número: ");
        n = Consola.leerEntero(); 
        
        while ( i <= n) {
        	if (n % i == 0) {
        		c++;
        	}
        	i++;
        }
        if (c == 2) {
        	System.out.println ("El número " +n+ ", es primo");
        }
        else {
        	System.out.println ("El número " +n+ ", no es primo");
        }
	}

}
