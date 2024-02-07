package tablas;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// Creamos la tabla
		int tabla[] = new int[10];
		//Inicializo la variable mayor
		int mayor = Integer.MIN_VALUE; 
		//Inicializo la variable menor
		int menor = Integer.MAX_VALUE;
		////Inicializo la variable suma
		int suma = 0;

		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el número
			System.out.println("Introduce el número " + (i + 1));
			// Vamos metiendo en las posiciones un número que elija el usuario
			tabla[i] = sc.nextInt();
		}
		//For para la suma el mayor y el menor
		for (int valor : tabla) {
			suma = suma + valor;
			
			mayor = valor > mayor ? valor : mayor;
			
			menor = valor < menor ? valor : menor;
		}

		//Pintamos el resultado

		System.out.println("La suma de los números de la tabla es de " + suma);
		System.out.println("El mayor número de la tabla es " + mayor);
		System.out.println("El menor número de la tabla es " + menor);
		
		sc.close();
	}
}
