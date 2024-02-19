package primerboletin;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la frase en la que buscar la palabra más largas
		String frase = "";
		// Variable en la que guardo el valor devuelto por la función con la palabra más larga
		String palabraLarga = "";
		
		// Pido que introduzca una frase
		System.out.println("Introduzca una frase en la que buscar la palabra más larga");
		// Guardo la cadena introducida en frase
		frase = sc.nextLine();
		
		// Llamo a la función compruebaLongitud y guardo el valor devuelto en palabraLarga
		palabraLarga = compruebaLongitud(frase);
		
		// Imprimo la palabra y su longitud
		System.out.println("La palabra más larga de la frase introducida es: " + palabraLarga 
							+ "\nSu longitud es: " + palabraLarga.length());
		
		// Cierro el Scanner
		sc.close();
	}

	/**
	 * Función que encuentra la palabra más larga en una frase
	 * @param frase Cadena en la que busco la palabra más larga
	 * @return Devuelve la palabra más larga
	 */
	public static String compruebaLongitud(String frase) {
		// Variable en la que guardo la frase recibida para no modificarla
		String copiaFrase = "";
		// Array en la que separar la frase en palabras
		String[] fraseSeparada = frase.split(" ");
		// Variable en la que guardo la palabra más larga
		String palabraMasLarga = "";
		
		// Bucle para buscar la palabra más larga de la frase 
		for(int i = 0; i < fraseSeparada.length; i++) {
			// Compruebo que el elemento sea más largo que el anterior y lo guardo
			if(fraseSeparada[i].length() > palabraMasLarga.length()) {
				palabraMasLarga = fraseSeparada[i];
			}
		}
		
		// Devuelvo palabraMasLarga como valor de la función
		return palabraMasLarga;
	}
	
}
