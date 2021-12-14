package base;

import java.util.Scanner;

public class Diccionario {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public Diccionario() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String palabra = new String();
		System.out.print ("Introduce palabra: ");
		palabra = teclado.next();
		
		if(palabra != null && palabra.equalsIgnoreCase("bit")) {
			System.out.println("M�nima unidad de informaci�n que representa un 0 � un 1.");
		}
		else if(palabra != null && palabra.equalsIgnoreCase("moneda")) {
			System.out.println("Pieza de metal, generalmente redonda y con un relieve en cada cara, a la que se le asigna un valor econ�mico determinado y se emplea como medio legal de pago.");
		}
		else {
			System.out.println("Palabra no encontrada");
		}

	}

}
