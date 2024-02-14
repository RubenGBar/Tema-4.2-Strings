package primerboletin;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Frase a comprobar que es palíndroma
		String palindromo = "";
		// Variable en la que guardo el valor de llamar a la función
		boolean palindromia = false;
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase: ");
		// Guardo el valor introducido por teclado en palindromo
		palindromo = sc.nextLine();
		
		// Llamo a la funcion compruebaPalindromo y guardo el valor en palindromia
		palindromia = compruebaPalindromo(palindromo);
		
		// Muestro un mensaje según si la cadena introducida por teclado es palíndroma o no
		if(palindromia) {
			System.out.println("La cadena es palíndroma");
		}else {
			System.out.println("La cadena no es palíndroma");
		}
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Función que comprueba que una cadena sea palíndroma
	 * @param palindromo Cadena a comprobar que sea palíndroma
	 * @return Devuelve si la cadena es palíndroma o no
	 */
	public static boolean compruebaPalindromo(String palindromo) {
		// Variable que devuelvo como valor de la función 
		boolean esPalindromo = true;
		
		// Elimino los espacios de la cadena
		palindromo = palindromo.trim().replace(" ", "");
		
		// Bucle para comprobar que la cadena sea palíndroma
		for(int i = 0; i < palindromo.length() && esPalindromo; i++) {
			// En el momento en que los caractéres de la cadena no coincidan esPalindromo será false y terminará de comprobar
			if(palindromo.charAt(i) != palindromo.charAt(palindromo.length() - i - 1)) {
				esPalindromo = false;
			}
		}
		
		// Devuelvo esPalindromo como valor de la función
		return esPalindromo;
	}

}
