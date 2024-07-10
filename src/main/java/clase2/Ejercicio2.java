/**
 * Ejercicio02
Comprobar si dos numeros son amigos. Dos numeros enteros positivos A y B son numeros amigos si la suma de los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.

Los divisores propios de un número incluyen la unidad pero no el propio numero.

Un ejemplo de numeros amigos son los numeros 220 y 284.

Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.

La suma de los divisores propios de 220 da como resultado 284

Los divisores propios de 284 son 1, 2, 4, 71 y 142.

La suma de los divisores propios de 284 da como resultado 220.

Por lo tanto 220 y 284 son amigos.

Otras parejas de numeros amigos son:
1184, 1210
2620, 2924
5020, 5564
6232, 6368
10744, 10856
12285, 14595
17296, 18416

 */


package clase2;
import com.github.sanchezih.util.io.Consola;

public class Ejercicio2 {

	public static void main(String[] args) {
		int suma1=0, suma2=0, n1, n2;
        
		System.out.print("Ingrese un primer número positivo: "); 
        n1 = Consola.leerEntero();
        	        
        System.out.print("Ingrese un segundo número positivo: "); 
        n2 = Consola.leerEntero();
        	        
  
        for(int i = 1;i < n1;i++){  // for para sumar todos los divisores propios de n1 (sin incluir el propio número)                                
             if(n1%i==0){
                suma1=suma1+i;
             }
        }
  
         for(int i = 1;i < n2;i++){  // for para sumar todos los divisiores propios de n2 (sin incluir el propio número)                                              
                if(n2%i==0){
                   suma2=suma2+i;
                }
            }

           if(suma1==n2 && suma2==n1){
        	   System.out.println (n1 + " y " + n2 + " son amigos");
           } else {
        	   System.out.println (n1 + " y " + n2 + " no son amigos");
        }
    }
}

