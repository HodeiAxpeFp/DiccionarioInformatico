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
		else if(palabra != null && palabra.equalsIgnoreCase("ordenador")) {
				System.out.println("es una m�quina que almacena y automatiza la informaci�n a trav�s de programas inform�ticos dise�ados espec�ficamente para esta tarea.");
		}
		else if(palabra != null && palabra.equalsIgnoreCase("algoritmo")) {
					System.out.println("Un algoritmo inform�tico es un conjunto de instrucciones definidas, ordenadas y acotadas para resolver un problema o realizar una tarea..");
		}
		else {
			System.out.println("Palabra no encontrada");
		}

	}

}
