package primerboletin;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner (System.in);
		// Variable en la que guardo la cadena introducida por teclado
		String cadena1 = "";
		// Variable en la que guardo otra cadena introducida por teclado
		String cadena2 = "";
		// Variable para saber si las palabras son anagramas
		boolean esAnagrama = false;
		
		// Pido que intdouzca una cadena por teclado
		System.out.println("Introduzca una frase o palabra para comprobar si son anagramas");
		// Guardo la cadena introducida en cadena1
		cadena1 = sc.nextLine();
		// Pido que intdouzca una cadena por teclado
		System.out.println("Introduzca una frase o palabra para comprobar si son anagramas");
		// Guardo la cadena introducida en cadena2
		cadena2 = sc.nextLine();
		
		// Llamo a la funci�n comprobarAnagrama para saber si las cadenas son anagramas
		esAnagrama = comprobarAnagrama(cadena1, cadena2);
		
		// Seg�n el valor de esAnagrama muestro el mensaje adecuado
		if(esAnagrama) {
			System.out.println("Las cadenas son Anagramas :D");
		}else {
			System.out.println("Las cadenas no son Anagramas :(");
		}
		
		// Cierro el Scanner
		sc.close();
	}

	/**
	 * Funci�n para comprobar que dos cadenas sean anagramas
	 * @param cadena1 Cadena a comprobar que sea anagrama de la segunda
	 * @param cadena2 Cadena a comrpobar que sea anagrama de la primera
	 * @return Devuelve un booleano para saber si las cadenas con anagramas o no
	 */
	public static boolean comprobarAnagrama(String cadena1, String cadena2) {
		// Variable para no modificar la cadena original recibida
		String copiaCadena1 = cadena1;
		// Variable para no modificar la cadena original recibida
		String copiaCadena2 = cadena2;
		// Variable para saber si las palabras son anagramas o no
		boolean esAnagrama = true;
		// Variable para usar como contador
		int cont = 0;
		
		// Elimino los espacios
		copiaCadena1.replace(" ", "").toLowerCase();
		// Elimino los espacios
		copiaCadena2.replace(" ", "").toLowerCase();
		// Convierto los caracteres a min�sculas
		copiaCadena1 = copiaCadena1.toLowerCase();
		// Convierto los caracteres a min�sculas
		copiaCadena2 = copiaCadena2.toLowerCase();
		// Array para guardar las cadenas en arrays de char
		char[] cadena1AChar = copiaCadena1.toCharArray();
		// Array para guardar las cadenas en arrays de char
		char[] cadena2AChar = copiaCadena2.toCharArray();
		// Ordeno los Arrays
		Arrays.sort(cadena1AChar);
		// Ordeno los Arrays
		Arrays.sort(cadena2AChar);
		// Bucle para comprobar que las frases sean anagramas
		while(esAnagrama && cont < cadena1AChar.length || cont < cadena2AChar.length) {
			// En el momento en que un caracter sea distinto de otro el bucle terminar�
			if (cadena1AChar[cont] != cadena2AChar[cont]) {
				esAnagrama = false;
			}
			// Aumento el contador
			cont++;
		}
		
		// Devuelvo anagrama como valor de la funci�n
		return esAnagrama;
	}
	
}
