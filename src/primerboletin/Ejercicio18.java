package primerboletin;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el títutlo para código HTML
		String titulo = "";
		// Variable para guardar el contenido para código HTML
		String contenido = "";
		// Variable para guardar el código en HTML
		String HTML = "";
		
		// Pido que introduzca el título de la página web
		System.out.println("Introduzca un título para su página web");
		titulo = sc.nextLine();
		// Pido que introduzca el resto del contenido de la página web
		System.out.println("Introduzca el contenido para su página web");
		contenido = sc.nextLine();		
		
		// Guardo el código HTML
		HTML = hacerHTML(titulo, contenido);
		
		// Muestro el código HTML
		System.out.println("El código HTML sería el siguiente:\n" + HTML);
		
		// Cierro el Scanner
		sc.close();
	}
	
	public static String hacerHTML(String titulo, String contenido) {
		// Variable en la que guardo el códgio HTML
		String HTML = "";
		// Variable para no modificar la variable titulo recibida
		String copiaTitulo = titulo;
		// Variable para no modificar la variable contenido recibida
		String copiaContenido = contenido;
		
		// Construyo el código HTML
		HTML = "<HTML>\n<Head>\n<Title>"+ titulo +"</Title>\n</Head>\n<Body>\n<h1>"+ titulo +"</h1>\n<p>"+ contenido +"</p>\n</Body>\n</HTML>";
		
		// Devuelvo HTML como valor de la función
		return HTML;
	}

}
