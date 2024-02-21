package primerboletin;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable a convertir en un nombre de variable en Java
		String frase = "";
		// Variable donde guardo la cadena convertida en un nombre de variable en Java
		String nombreVariable = "";
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase a convertir en nombre de variable en Java");
		// Guardo lo introducido por teclado en frase
		frase = sc.nextLine();
		
		// Convierto la frase en nombre de variable en Java
		nombreVariable = aVariableJava(frase);
		
		// Muestro la cadena como nombre de variable
		System.out.println("La frase introducida como nombre de variable en Java es: " + nombreVariable);
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Funci�n que convierte una cadena en el nombre de una variable en Java
	 * @param frase Cadena a convertir en un nombre de variable en Java
	 * @return Una cadena que es un nombre para una variable en Java
	 */
	public static String aVariableJava(String frase) {
		// Variable para guardar una copia de la frase en min�sculas
		String fraseMin = frase.toLowerCase();		
		// Variable para construir la nueva cadena en notaci�n Camel
		String fraseVariable = "";
		// Array para dividir la cadena recibida
		String[] fraseEnPalabras = fraseMin.split(" ");
		// Variable para obtener la palbra que se guarda en cada posici�n del Array
		String palabra = "";
		// Variable para guardar el caracter a cambiar
		char caracterACambiar = ' ';
		
		// Bucle for para convertir la cadena en el nombre de una variable en Java
		for(int i = 0; i < fraseEnPalabras.length; i++) {
			// Me quedo con la palabra de la posici�n de esa iteraci�n del bucle
			palabra = fraseEnPalabras[i];
			// Me quedo con el caracter del principio de cada palabra
			caracterACambiar = palabra.charAt(0);
			
			// Compruebo que la i no sea 0 para no cambiar la primera palabra
			if(i != 0) {
				// Cambio el primer caracter a may�culas y lo concadeno con el resto de la frase
				palabra = Character.toUpperCase(caracterACambiar) + palabra.substring(1);
			}
			// Construyo con las palabras modificadas la cadena en notaci�n camel
			fraseVariable += palabra;
		}
		// Devuelvo fraseEnVariable como valor de la funci�n 
		return fraseVariable;
	}

}
