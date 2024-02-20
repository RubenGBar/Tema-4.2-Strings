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
	 * Función que convierte una cadena en el nombre de una variable en Java
	 * @param frase Cadena a convertir en un nombre de variable en Java
	 * @return Una cadena que es un nombre para una variable en Java
	 */
	public static String aVariableJava(String frase) {
		// Variable para guardar la frase introducida como el nombre de una variable en Java
		String fraseEnVariable = "";
		// Variable para guardar una copia de la frase
		String copiaFrase = frase;
		// Variable para guardar una copia de la frase en minúsculas
		String fraseMin = copiaFrase.toLowerCase();		
		// Variable para guardar una copia de la frase en mayúsculas
		String fraseMayus = copiaFrase.toUpperCase();
		
		// Bucle for para convertir la cadena en el nombre de una variable en Java
		for(int i = 0; i < copiaFrase.length(); i++) {
			// Compruebo que el caracter en esa iteración sea un espacio
			if(copiaFrase.charAt(i) == ' ') {
				// Cambio el caracter después del espacio por el mismo, pero en mayíusculas
				fraseMin = fraseMin.replace(copiaFrase.charAt(i+1), fraseMayus.charAt(i+1));
			}
			
		}
		
		// Elimino los espacios
		fraseEnVariable = fraseMin.replace(" ", "");
		
		// Devuelvo fraseEnVariable como valor de la función 
		return fraseEnVariable;
	}

}
