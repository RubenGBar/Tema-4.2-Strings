package primerboletin;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Frase a comprobar que es pal�ndroma
		String palindromo = "";
		// Variable en la que guardo el valor de llamar a la funci�n
		boolean palindromia = false;
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase: ");
		// Guardo el valor introducido por teclado en palindromo
		palindromo = sc.nextLine();
		
		// Llamo a la funcion compruebaPalindromo y guardo el valor en palindromia
		palindromia = compruebaPalindromo(palindromo);
		
		// Muestro un mensaje seg�n si la cadena introducida por teclado es pal�ndroma o no
		if(palindromia) {
			System.out.println("La cadena es pal�ndroma");
		}else {
			System.out.println("La cadena no es pal�ndroma");
		}
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Funci�n que comprueba que una cadena sea pal�ndroma
	 * @param palindromo Cadena a comprobar que sea pal�ndroma
	 * @return Devuelve si la cadena es pal�ndroma o no
	 */
	public static boolean compruebaPalindromo(String palindromo) {
		// Variable que devuelvo como valor de la funci�n 
		boolean esPalindromo = true;
		// Variable para no modificar la introducida por el usuario
		String frasePalindroma = "";
		
		// Elimino los espacios de la cadena
		frasePalindroma = palindromo.trim().replace(" ", "");
		// Cambio todos los caracteres a min�sculas para por si introducen caracteres en may�sculas
		frasePalindroma = frasePalindroma.toLowerCase();
		
		// Bucle para comprobar que la cadena sea pal�ndroma
		for(int i = 0; i < frasePalindroma.length()/2 && esPalindromo; i++) {
			// En el momento en que los caract�res de la cadena no coincidan esPalindromo ser� false y terminar� de comprobar
			if(frasePalindroma.charAt(i) != frasePalindroma.charAt(frasePalindroma.length() - i - 1)) {
				esPalindromo = false;
			}
		}
		
		// Devuelvo esPalindromo como valor de la funci�n
		return esPalindromo;
	}

}
