package primerboletin;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
	// Creo un objeto de la clase Scanner 
	Scanner sc = new Scanner(System.in);
	// Variable para guardar la contraseña a guardar
	String contrasenia = "Infinito";
	// Variable para guardar la respuesta del usuario
	String respuesta = "";
	// Variable par ir mostrando por pantalla con asteriscos
	String respuestaConstruida = "";
	// Variable para controlar el bucle do while
	boolean acertado = true;

	// Bucle para repetir el programa hasta que la palabra introducida sea igual a la contraseña
	do {
		/* 
		 * Vuevlo a iniciar la variable respuestaConstruida a cadena vacía para poder 
		 * volver a construir una cadena con la nueva respuesta
		 * */
		respuestaConstruida = "";
		// Pido que introduzca una palabra
		System.out.println("Introduzca una palabra para acertar la contraseña");
		// Guardo el valor introducido del teclado en respuesta
		respuesta = sc.next();

		// Bucle for para ir construyendo la respuesta con los asteriscos y caracteres acertados
		for (int i = 0; i < contrasenia.length(); i++) {
			// Añado el caracter cuando sean iguales y la palabra introducida menor que la i
			if (i < respuesta.length() && respuesta.charAt(i) == contrasenia.charAt(i)) {
				respuestaConstruida += respuesta.charAt(i);
				// En otro caso añado asteriscos
			} else {
				respuestaConstruida += "*";
			}
		}

		// Muestro la respuesta con los asteriscos
		System.out.println("\nContraseña:\n" + respuestaConstruida + "\n");

		// Cuando las palabras sean iguales termino el bucle
		if (respuesta.equals(contrasenia)) {
			acertado = false;
		}

	} while (acertado);
	
	
	// Cierro el Scanner
	sc.close();
}
}
