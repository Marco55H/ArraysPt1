package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		// Tabla con los puntos 
		int tabla[] = new int[8];
		
		// Tabla que ordena jugadores
		int ordenado[] = new int[8];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle para rellenar la tabla de puntuacion
		for(int i= 0; i < tabla.length; i++) {
			System.out.println("¿Cuánto has sacado?");
			tabla[i] = sc.nextInt();
		}
		// Ordenar la tabla 
		Arrays.sort(tabla);
		
		// For para recorer del reves la tabla clasificacion
		for(int i = 0; i < ordenado.length; i++) {
			ordenado[i] = tabla[(tabla.length - 1) - i];
		}
		
		// Imprimimos la clasificacion
		System.out.println(Arrays.toString(ordenado));

		// Cierramos el Scanner
		sc.close();
	}

}
