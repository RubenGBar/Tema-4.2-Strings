package primerboletin;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para pasar a la función como argumento
		String frase = "";
		// Variable para guardar el valor devuelto por la función
		int numEspacios = 0;
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una cadena con espacios");
		// Guardo el valor introducido por teclado en frase
		frase = sc.nextLine();
		
		// Llamo a la función y guardo el valor en numEspacios
		numEspacios = cuentaEspacios(frase);
		
		// Indico por pantalla el número de espacios
		System.out.println("La cadena contiene " + numEspacios + " espacio/s");
		
		// Cierro el Scanner
		sc.close();
	}
	/**
	 * Función para contar los espacios de una cadena
	 * @param frase Cadena a contar espacios
	 * @return Número de espacios de la cadena
	 */
	public static int cuentaEspacios(String frase) {
		// Variable que devuelvo como valor de la función 
		int numeroEspacios = 0;
		
		// Bucle para contar los espacios
		for(int i = 0; i < frase.length(); i++) {
			// Si encunetro un espacio aumento el valor de numeroEspacios en 1
			if(frase.charAt(i) == ' ') {
				numeroEspacios += 1;
			}
		}
		
		// Devuevlo numeroEspacios como valor de la función
		return numeroEspacios;
	}
}
