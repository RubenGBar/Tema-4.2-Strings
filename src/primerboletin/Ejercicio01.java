package primerboletin;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Creo un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardra la primera cadena introducida por teclado
		String cadena1 = "";
		// Variable para guardra la segunda cadena introducida por teclado
		String cadena2 = "";
		
		// Pido que intrdoduzca una frase
		System.out.println("Introduzca una frase: ");
		// Leo el valor de cadena1
		cadena1 = sc.nextLine();
		// Pido que intrdoduzca una frase
		System.out.println("Introduzca una frase: ");
		// Leo el valor de cadena2
		cadena2 = sc.nextLine();

		// Llamo a la funci�n cuentaCaracteres para que muestre que cadena es m�s corta
		cuentaCaracteres(cadena1, cadena2);
		
		// Cierro el Scanner
		sc.close();
	}

	/**
	 * Funci�n con la que cuento los caract�res de cada cadena y
	 * muestro por pantalla cual es m�s corta
	 * @param cadena1
	 * @param cadena2
	 */
	public static void cuentaCaracteres(String cadena1, String cadena2) {
		// Variable para guardar el n�mero de caract�res de la primera cadena
		int caracteresCadena1 = 0;
		// Variable para guardar el n�mero de caract�res de la segunda cadena
		int caracteresCadena2 = 0;

		// Bucle para contar el n�mero de caract�res de la primera cadena
		for(int i = 1; i <= cadena1.length(); i++) {
			// Guardo el valor del contador en la variable caracteresCadena1
			caracteresCadena1 = i;
		}
		// Bucle para contar el n�mero de caract�res de la segunda cadena
		for (int i = 1; i <= cadena2.length(); i++) {
			// Guardo el valor del contador en la variable caracteresCadena2
			caracteresCadena2 = i;
		}

		// Muestro por pantalla cual es la cadena m�s corta mediante un if
		if (caracteresCadena1 < caracteresCadena2) {
			System.out.println("La primera frase es m�s corta ya que cuenta con: " + caracteresCadena1 + " caract�res");
		}else {
			System.out.println("La segunda frase es m�s corta ya que cuenta con: " + caracteresCadena2 + " caract�res");
		}
	}

}
