package primerboletin;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Array para guardar los caracteres a descodificar
		char conjunto1[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// Array para guardar la descodificación de cada caracter
		char conjunto2[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// Variable para guardar la frase introducida por teclado
		String frase = "";
		// Variable en la que guardo la frase que voy construyendo
		String fraseDescodificada = "";

		// Pido que introduzca una frase a descodificar
		System.out.println("Introduzca una frase para descodificarla: ");
		// Guardo el valor introducido por teclado y lo guardo en frase en minúsculas
		frase = sc.nextLine().toLowerCase();
		// Bucle para descodificar la frase caracter a caracter
		for (int i = 0; i < frase.length(); i++) {
			fraseDescodificada += desCodifica(conjunto1, conjunto2, frase.charAt(i));
		}

		// Muestro la frase descodificada
		System.out.println("La frase descodificada es la siguiente:\n" + fraseDescodificada);

		// Cierro el Scanner
		sc.close();
	}
	/**
	 * Función para descodificar frases
	 * @param conjunto1 Array de que caractéres se descodifican
	 * @param conjunto2 Array con ese caracter descodificados
	 * @param c Caracter de la frase a descodificar
	 * @return Devuelvo el caracter descodificado
	 */
	public static char desCodifica(char conjunto1[], char conjunto2[], char c) {
		// Variable para devolver como valor de la función
		char desCodificado = c;

		// Bucle para comprobar que el caracter sea uno a descodificar
		for (int i = 0; i < conjunto1.length; i++) {
			// Compruebo que el caracter se encunetre en la tabla y lo descodifico
			if (conjunto1[i] == c) {
				desCodificado = conjunto2[i];
			}
		}
		// Devuevlo codificado como valor de la función
		return desCodificado;
	}
}
