package primerboletin;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el t�tutlo para c�digo HTML
		String titulo = "";
		// Variable para guardar el contenido para c�digo HTML
		String contenido = "";
		// Variable para guardar el c�digo en HTML
		String HTML = "";
		
		// Pido que introduzca el t�tulo de la p�gina web
		System.out.println("Introduzca un t�tulo para su p�gina web");
		titulo = sc.nextLine();
		// Pido que introduzca el resto del contenido de la p�gina web
		System.out.println("Introduzca el contenido para su p�gina web");
		contenido = sc.nextLine();		
		
		// Guardo el c�digo HTML
		HTML = hacerHTML(titulo, contenido);
		
		// Muestro el c�digo HTML
		System.out.println("El c�digo HTML ser�a el siguiente:\n" + HTML);
		
		// Cierro el Scanner
		sc.close();
	}
	
	public static String hacerHTML(String titulo, String contenido) {
		// Variable en la que guardo el c�dgio HTML
		String HTML = "";
		// Variable para no modificar la variable titulo recibida
		String copiaTitulo = titulo;
		// Variable para no modificar la variable contenido recibida
		String copiaContenido = contenido;
		
		// Construyo el c�digo HTML
		HTML = "<HTML>\n<Head>\n<Title>"+ titulo +"</Title>\n</Head>\n<Body>\n<h1>"+ titulo +"</h1>\n<p>"+ contenido +"</p>\n</Body>\n</HTML>";
		
		// Devuelvo HTML como valor de la funci�n
		return HTML;
	}

}
