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
			
		}else  if(palabra != null && palabra.equalsIgnoreCase("CPU")){
			System.out.println("Unidad central de procesamiento: Lleva a cabo la union completa del las caracteristicas del equipo.");
			
		}else {
			System.out.println("Palabra no encontrada");
		
		}

	}

}
