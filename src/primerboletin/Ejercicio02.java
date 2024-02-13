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
	// Variable para controlar el bucle
	boolean acertado = true;
	// Variable para usar como contador 
	int i = 0;
	
	// Bucle para comparar las cadenas
	do {
		// Pido que introduzca una palabra
		System.out.println("Introduzca una palabra para acertar la contraseña");
		// Guardo el valor introducido del teclado en respuesta
		respuesta = sc.nextLine();
		
		/*
		 * TERMINAR
		 * */
		if (respuesta.charAt(i) == contrasenia.charAt(i)) {
			System.out.println(contrasenia.charAt(i));
		} else {
			System.out.println("*");
		}
		
		// Cuando las palabras sean iguales termino el bucle
		if(respuesta == contrasenia) {
			acertado = false;
		}
		
	} while (acertado);

	// Cierro el Scanner
	sc.close();
	}
}
