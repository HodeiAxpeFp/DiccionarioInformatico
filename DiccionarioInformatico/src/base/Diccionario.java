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
		else if(palabra !=null && palabra.equals("lan")) {
			System.out.println("Una LAN, abreviatura para Local"
					+ " Area Network (Red de Area Local), es una red que "
					+ "cubre un �rea geogr�fica peque�a, como hogares, oficinas y grupos de edificios.");
		}
		else {
			System.out.println("Palabra no encontrada");
		}

	}

}
