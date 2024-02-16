package primerboletin;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar lo introducido por teclado
		String frase = "";
		// Variable para guardar el valor devuelto por la funci�n al llamarla
		String fraseTraducida = "";
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase a traducir");
		frase = sc.nextLine();
		
		// Compruebo que la frase est� en idioma Javalandia
		if(frase.startsWith("Javal�n, javal�n") || frase.endsWith("javal�n, len, len")) {
			// Llamo a la funci�n traductir y lo guardo en fraseTraducida
			fraseTraducida = traductor(frase);
			// Muestro la frase traducida
			System.out.println("La frase traducida ser�a as�:\n" + fraseTraducida);
		}else {
			// Muestro la cadena tal cual ya que no est� en idioma Javalandia
			System.out.println("La frase no se encuentra en idioma Javalandia, por lo que ser�a as�:\n" + frase);
		}
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Funci�n para traducir el idioma de Javalndia y sus dialectos
	 * @param frase La frase a traducir
	 * @return Devuelvo la frase traducida
	 */
	public static String traductor(String frase) {
		// Variable para no modificar la frase original
		String copiaFrase = frase;
		
		// Traduzco la frase seg�n si es un dialecto o no
		if(copiaFrase.startsWith("Javal�n, javal�n")) {
			// Remplazo el idioma javalandia y quito los espacios de la frase
			copiaFrase = copiaFrase.replace("Javal�n, javal�n", "").trim();
		} else {
			// Remplazo el idioma javalandia y quito los espacios de la frase
			copiaFrase = copiaFrase.replace("javal�n, len, len", "").trim();
		}
		
		// Devuevlo copiaFrase como valor de la funci�n
		return copiaFrase;
	}

}
