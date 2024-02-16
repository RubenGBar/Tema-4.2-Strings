package primerboletin;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Array para guardar los caracteres a codificar
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// Array para guardar la codificación de cada caracter
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// Variable para guardar la frase introducida por teclado
		String frase = "";
		// Variable en la que guardo la frase que voy construyendo
		String fraseCodificada = "";

		// Pido que introduzca una frase a codificar
		System.out.println("Introduzca una frase para codificarla: ");
		// Guardo el valor introducido por teclado y lo guardo en frase en minúsculas
		frase = sc.nextLine().toLowerCase();
		// Bucle para codificar la frase caracter a caracter
		for (int i = 0; i < frase.length(); i++) {
			fraseCodificada += codifica(conjunto1, conjunto2, frase.charAt(i));
		}

		// Muestro la frase codificada
		System.out.println("La frase codificada es la siguiente:\n" + fraseCodificada);

		// Cierro el Scanner
		sc.close();
	}
	/**
	 * Función para codificar frases
	 * @param conjunto1 Array de que caractéres se codifican
	 * @param conjunto2 Array con ese caracter codificado
	 * @param c Caracter de la frase a codificar
	 * @return Devuelvo el caracter codificado
	 */
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		// Variable para devolver como valor de la función
		char codificado = c;

		// Bucle para comprobar que el caracter sea uno a codificar
		for (int i = 0; i < conjunto1.length; i++) {
			// Compruebo que el caracter se encunetre en la tabla y lo codifico
			if (conjunto1[i] == c) {
				codificado = conjunto2[i];
			}
		}
		// Devuevlo codificado como valor de la función
		return codificado;
	}
	
}
