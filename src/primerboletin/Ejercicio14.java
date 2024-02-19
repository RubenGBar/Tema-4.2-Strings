package primerboletin;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		// Creo el Scanner 
		Scanner sc = new Scanner(System.in);
		// Variable para guardar la frase introducida por teclado y contar sus letras
		String frase = "";
		// Variable para saber de que letra es el contador según el contador del bucle
		char letra = ' ';
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase: ");
		// Guardo lo introducido por teclado en frase
		frase = sc.nextLine();
		// Array para guardar el contador de cada letra
		int[] contadorLetras = contarLetras(frase);
		
		// Muestro el resultado de cada letra con un bucle for
		System.out.println("\nResultado:");
		for (int i = 0; i < contadorLetras.length; i++) {
			// Muestro solo las letras que hayan aumentado su contador
			if (contadorLetras[i] > 0) {
				// Calculo la posición del contador de cada letra en el Array
				letra = (char) ('a' + i);
				// Imprimo cada letra con su contador
				System.out.println(letra + ": " + contadorLetras[i] + " veces");
			}
		}
		
		// Cierro el Scanner
		sc.close();
	}

	public static int[] contarLetras(String frase) {
		// Array del tamaño del abecedario para guardar el número de veces que aparece una letra
		int[] letrasContadas = new int[27];
		// Variable para copiar la frase y no modificar la original
		String copiaFrase = frase;
		// Variable para saber la letra que se va a contar
		char letra = ' ';
		// Variable para saber en que posición del array guardo cada letra
		int indice = 0;
		
		// Elimino los espacios de la frase y pongo los caracteres en minúsculas
		copiaFrase = copiaFrase.replace(" ", "").toLowerCase();
		// Bucle para contar los caracteres de la frase
		for(int i = 0; i <copiaFrase.length(); i++) {
			// Selecciono el caracter de la frase según la iteración del bucle
			letra = frase.charAt(i);
			// Si el caracter se encuentra en el alfabeto
			if (letra >= 'a' && letra <= 'z') {
				// Calculo la posición del contador de esa letra en el array
				indice = letra - 'a';
				// Incremento el contador de esa letra
				letrasContadas[indice]++;
			}
		}
		
		// Devuelvo las letras contadas como valor de la función
		return letrasContadas;
	}
	
}
