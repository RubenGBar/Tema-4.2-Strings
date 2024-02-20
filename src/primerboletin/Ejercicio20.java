package primerboletin;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Cadena a dividir
		String frase = "";
		// Longitud de cada trozito dividido
		int divisor = 0;
		
		// Pido que introduzca una cadena a dividir
		System.out.println("Introduzca una frase a dividir");
		// Leo del teclado la cadena y la guardo
		frase = sc.nextLine();
		// Pido que introduzca la longitud de los trozos dividios
		System.out.println("¿En trozos de qué longitud la quiere dividir?");
		// Leo del teclado la cadena y la guardo
		divisor = sc.nextInt();
		
		// Guardo cada parte de la cadena dividida
		String[] fraseDividida = divideCadena(frase, divisor);
		
		// Muestro la cadena dividida
		System.out.println(Arrays.toString(fraseDividida));
		
		// Cierro el Scanner
		sc.close();
	}

	/**
	 * Función para dividir una cadena según un valor especificado
	 * @param frase Cadena a dividir
	 * @param divisor Longitud de cada trozo de la cadena a dividir
	 * @return Un Array con cada trozo de la cadena ya dividida en cada posición del Array
	 */
	public static String[] divideCadena(String frase, int divisor) {
		// Calculo la cantidad de divisiones necesarias
	    int cantidadDivisiones = (frase.length() + divisor - 1) / divisor;
		// Array que devuelvo como valor de la función
		String[] cadenaDividida = new String[(int)Math.round(cantidadDivisiones)];
		// Variable para no modificar la cadena original
		String copiaFrase = frase;
		
		// Bucle para dividir la cadena introducida
		for(int i = 0; i < (int)Math.round(cantidadDivisiones); i++) {
			// Compruebo que la longitud de la cadena sea más grande que el divisor
			if(copiaFrase.length() > divisor) {
				// Asigno a cada indice del array el substring correspondiente desde 0 hasta el divisor
				cadenaDividida[i] = copiaFrase.substring(0 , divisor);
				// Modifico la cadena para quitarle parte ya añadidad
				copiaFrase = copiaFrase.substring(divisor);
			// Compruebo que la longitud de la cadena sea más pequeña que el divisor
			}else if (copiaFrase.length() <= divisor) {
				// Añado la parte que queda de la cadena como último índice del Array
				cadenaDividida[i] = copiaFrase;
			}
			
		}
		// Devuelvo cadenaDividida como valor de la función
		return cadenaDividida;
	}
	
}
