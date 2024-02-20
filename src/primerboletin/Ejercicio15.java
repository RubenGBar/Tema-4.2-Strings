package primerboletin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable donde guardo la palabra introducida por teclado
		String palabra = "";
		// Variable para guardar el anagrama generado aleatoriamente a adivinar
		String palabraAleatoria = "";
		// Variable para guardar otro anagrama aleatorio que se mostrar� como pista
		String pista = "";
		// Variable en la que guardo el intento de adivinar el anagrama
		String intentoPalabra = "";

		// Bucle para que no se pueda introducir la cadena vac�a
		do {
			System.out.println("Introduzca una palabra: ");
			palabra = sc.nextLine();
		} while (palabra.equals(""));
		
		
		// Convierto los caracteres de la palabra a min�sculas
		palabra = palabra.toLowerCase();
		// Genero el anagrama aleatorio a adivinar
		palabraAleatoria = anagramaAleatorio(palabra);
		// Genero otro anagrama como pista
		pista = anagramaAleatorio(palabra);
		
		// Bucle para repetir el programa hasta que la palabra introducida sea igual al anagrama aleatorio
		do {
			// Pido que introduzca una frase y muestro la pista
			System.out.println("Adivine el anagrama aleatorio generado.\nPista: " + pista);
			// Leo el valor introducido por teclado en intentoPalabra
			intentoPalabra = sc.nextLine();
			
		} while (!intentoPalabra.equals(palabraAleatoria));
		// Muestro un mensaje en el que indico que ha acertado
		System.out.println("ENHORABUENA HAS ACERTADO!!");
		
		// Cierro el Scanner
		sc.close();
	}
	
	/**
	 * Funci�n para construir un anagramaAleatorio
	 * @param palabra La palabra a partir de la cual se genera el anagrama
	 * @return Devuelve un anagrama construido a partir de la palabra introducida
	 */
	public static String anagramaAleatorio(String palabra) {
		// Variable para no modificar la palabra recibida
		String copiaPalabra = palabra;
		// Creo un objeto de la clase random
		Random rand = new Random();
		// Array en el que guardo los caracteres de la cadena
		char[] palabraArray = copiaPalabra.toCharArray();
		// Array en el que guardo los n�meros aleatorios ya generados
		int[] numerosGenerados = new int[copiaPalabra.length()];
		// Variable en la que voy construyendo el anagrama aleatorio
		String palabraConstruida = "";
		// Variable que uso como contador
		int cont = 0;
		// Variable para guardar los n�meros aleatorios generados
		int numAleatorio = 0;
		
		/*
		 * Relleno la tabla que guarda los n�emros aleatorios ya generados con un n�mero fuera de las posiciones
		 * de los caracteres de la plabara para no tener problema al comparar el Array con el nuevo n�mero 
		 * aleatorio generado
		 * */
		Arrays.fill(numerosGenerados, -1);
		
		// Bucle para construir el anagrama aleatorio
		while(cont < copiaPalabra.length()) {
			// Genero un n�mero aleatorio que no sea m�s grande que el n�mero de caracteres de la palabra
			numAleatorio = rand.nextInt(0, copiaPalabra.length());
			// Llamo a la funci�n busqueda para comprobar que el n�mero aleatorio no sea el mismo y entonces
			if(busqueda(numerosGenerados, numAleatorio) < 0) {
				// Construyo el anagrama
				palabraConstruida += palabraArray[numAleatorio];
				// Guardo el n�mero aleatorio en el array de n�meros generados
				numerosGenerados[cont] = numAleatorio;
				// Aumento el contador
				cont++;
			}
		}
		
		// Devuelvo el anagrama aleatorio como valor de la funci�n 
		return palabraConstruida;
	}
	
	/**
	 * Funci�n para comprobar que los n�meros aleatorios sean distintos a los ya existentes
	 * @param tabla Array en la que compruebo que no exista el n�mero aleatorio generado
	 * @param valor Numero aleatorio generado
	 * @return Devuelve un n�mero negativo si el n�mero aleatorio es distinto de los ya generados y otro n�mero si no
	 */
	public static int busqueda(int tabla[], int valor) {
		// Variable que devuelvo como valor de la funci�n
		int indice = 0;
		
		/*
		 * Bucle while que devuelve un n�mero mayor que la longitud de la tabla si el
		 * nuevo n�mero aleatorio es igual que otro del array
		 */
		while (indice < tabla.length && valor != tabla[indice]) {
			indice++;
		}

		/*
		 * Si el n�mero devuelto por el bucle anterior es igual que el tama�o de la
		 * tabla devuelvo un n�mero menor que cero para que en el main se asigne el
		 * n�mero aleatorio a la posici�n del array ya que es distinto de los otros
		 */
		if (indice == tabla.length) {
			indice = -1;
		}

		// Devuelvo inidice como valor de la clase
		return indice;
	}

}
