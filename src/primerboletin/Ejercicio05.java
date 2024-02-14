package primerboletin;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la cadena introducida por teclado
		String frase = "";
		// Variable para guardar el valor de llamara a la función
		String esarf = "";
		
		// Pido que intrduzca una cadena
		System.out.println("Introduzca una frase: ");
		// Guardo la cadena introducida en frase
		frase = sc.nextLine();
		
		// Llamo a la función para invertir la cadena y lo guardo
		esarf = invertirFrase(frase);
		
		// Imprimo la cadena invertida
		System.out.println("La frase invertida es: \n" + esarf);
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Función que invierte cadenas
	 * @param frase Cadena a invertir
	 * @return Devuelve la cadena invertida
	 */
	public static String invertirFrase(String frase) {
		// Variable que devuelvo como valor de la función
		String fraseinvertida = "";
		
		// Bucle para construir la cadena invertida
		for(int i = frase.length() - 1; i >= 0; i--) {
			// Construyo la cadena desde el final de la frase al principio
			fraseinvertida += frase.charAt(i);
		}
		
		// Devuevlo esarf como valor de la función
		return fraseinvertida;
	}

}
