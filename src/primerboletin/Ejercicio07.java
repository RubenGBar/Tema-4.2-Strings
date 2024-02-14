package primerboletin;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la palabra introducida por teclado
		String palabra = "";
		// Variable para guardar la frase introducida por teclado
		String frase = "";
		
		// Pido que introduzca una palabra
		System.out.println("Introduzca una palabra");
		// Guardo el valor introducido por teclado en palabra
		palabra = sc.nextLine();
		// Pido que introduzca una frase
		System.out.println("Introduzca una frase");
		// Guardo el valor introducido por teclado en frase
		frase = sc.nextLine();
		
		
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Función para contar cuantas veces se encuentra en una frase
	 * una palabra concreta
	 * @param palabra La palabra a buscar de la frase
	 * @param frase La frase en la que se busca la palabra
	 * @return Devuelve el número de veces que aparece esa palabra en la frase
	 */
	public static int cuentaPalabrasEnFrase(String palabra, String frase) {
		// Variable para guardar el valor que devuelve la función
		int vecesAparecePalabra = 0;
		
		
		
		// Devuelvo vecesAparecePalabra como valor de la función
		return vecesAparecePalabra;
	}

}
