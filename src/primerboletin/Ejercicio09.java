package primerboletin;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar lo introducido por teclado
		String frase = "";
		// Variable para guardar el valor devuelto por la función al llamarla
		String fraseTraducida = "";
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase a traducir");
		frase = sc.nextLine();
		
		// Compruebo que la frase esté en idioma Javalandia
		if(frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len")) {
			// Llamo a la función traductir y lo guardo en fraseTraducida
			fraseTraducida = traductor(frase);
			// Muestro la frase traducida
			System.out.println("La frase traducida sería así:\n" + fraseTraducida);
		}else {
			// Muestro la cadena tal cual ya que no está en idioma Javalandia
			System.out.println("La frase no se encuentra en idioma Javalandia, por lo que sería así:\n" + frase);
		}
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Función para traducir el idioma de Javalndia y sus dialectos
	 * @param frase La frase a traducir
	 * @return Devuelvo la frase traducida
	 */
	public static String traductor(String frase) {
		// Variable para no modificar la frase original
		String copiaFrase = frase;
		
		// Traduzco la frase según si es un dialecto o no
		if(copiaFrase.startsWith("Javalín, javalón")) {
			// Remplazo el idioma javalandia y quito los espacios de la frase
			copiaFrase = copiaFrase.replace("Javalín, javalón", "").trim();
		} else {
			// Remplazo el idioma javalandia y quito los espacios de la frase
			copiaFrase = copiaFrase.replace("javalén, len, len", "").trim();
		}
		
		// Devuevlo copiaFrase como valor de la función
		return copiaFrase;
	}

}
