package primerboletin;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la frase
		String frase = "";
		
		// Pido que introduzca una frase
		System.out.println("Introduzca una frase");
		// Guardo el valor introducido introducido por teclado en frase
		frase = sc.nextLine();
		
		// Llamo a la función para mostrar la frase de forma ordenada
		ordenaPalabras(frase);
		
		// Cierro el Scanner
		sc.close();
	}
	/**
	 * Función que muestra las palbras de la variable de forma ordenada
	 * @param frase Frase introducida por teclado a ordenar sus palabras
	 */
	public static void ordenaPalabras(String frase) {
		// Array para guardar la frase ordenada
		String[] palabras = frase.split(" ");
		
		// Ordeno las palabras alfabéticamente
		Arrays.sort(palabras);
		
		// Imrpimo antes el mensaje para que no se repita en cada iteración
		System.out.println("Las palabras en orden son: ");
		// Imrpimo el Array
		for(int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}
	
}
