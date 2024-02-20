package primerboletin;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable en la que guardo la frase introducida por teclado
		String frase = "";
		// Variable para guardar la frase sin los comentarios
		String fraseSinComentarios = "";
		
		// Pido que introduzca una cadena
		System.out.println("Introduzca una frase a la que quitarle los comentarios");
		// Guardo el valor introducido por teclado en frase
		frase = sc.nextLine();
		
		// Guardo la cadena sin comentarios
		fraseSinComentarios = quitaComentarios(frase);
		
		// Muestro la cadena sin comentarios
		System.out.println("La frase sin los comentarios es: " + fraseSinComentarios);
		
		// Cierro el Scanner
		sc.close();
	}
	
	public static String quitaComentarios(String frase) {
		// Variable para no modificar la frase recibida
		String copiaFrase = frase;
		// Variable para gaurdar el comentario en la cadena
		String comentario = "";
		// Guardo la posición de inicio del comentario
		int inicioCom = 0;
		// Guardo la posición de fin del comentario
		int finCom = 0;
		
		// Bucle para recorrer el Array
		for(int i = 0; i < copiaFrase.length(); i++) {
			// Compruebo que la cadena tenga un comentario
			if(copiaFrase.contains("/*")) {
				// Busco la posición del inicio del comentario
				inicioCom = copiaFrase.indexOf("/*");
				// Busco la posición del fin del comentario
				finCom = copiaFrase.indexOf("*/");
				// Hago un substring con el comentario y sin el espacio antes de este
				comentario = copiaFrase.substring(inicioCom-1, finCom+2);
				// Elimino el comentario de la frase y espacio antes de este
				copiaFrase = copiaFrase.replace(comentario, "");
				
			}
		}
		
		// Devuelvo coopiaFrase como valor de la función
		return copiaFrase;
	}

}
