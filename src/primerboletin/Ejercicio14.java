package primerboletin;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la frase introducida por teclado y contar sus letras
		String frase = "";
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase: ");
		// Guardo lo introducido por teclado en frase
		frase = sc.nextLine();
		
		// Cierro el Scanner
		sc.close();
	}

}
