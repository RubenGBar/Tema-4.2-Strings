package primerboletin;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la frase del usuario
		String palabra = "";
		// Variable para construir una cadena con las palabras introducidas
		String frase = "";
		// Variable para controlar el bucle
		boolean noEsFin = true;
		
		// Bucle para pedir palabras hasta que se introduzca fin
		while(noEsFin) {
			// Pido que introduzca una cadena
			System.out.println("Introduzca una palabra");
			// Guardo el valor introducido por teclado en palabra
			palabra = sc.nextLine();
			
			// Compruebo que la palabra sea fin para saber si la guardo o no
			if(!palabra.equalsIgnoreCase("fin")) {
				// Construyo la frase
				frase += palabra + " ";
			// Si la frase es fin cambio la variable que controla el bucle a false
			}else {
				noEsFin = false;
			}
			
		}
		// Muestro la frase con tdas las palabras sin fin
		System.out.println("Las palabras construida como una frase es así:\n" + frase);
		// Cierro el Scanner
		sc.close();
	}

}
