package tablas;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		// creamos la tabla con una longitud de 8 huecos
		int tabla[] = new int[8];
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el número
			System.out.println("Introduce el número " + (i + 1));
			// Vamos metiendo en las posiciones un número que elija el usuario
			tabla[i] = sc.nextInt();
		}
		// Creamos un for ich para recorrer toda la tabla
		for (int valor : tabla) {
			//Si el número de la posisción i es divisible entre 2, el número es par
			if (valor % 2 == 0) {
				System.out.println("El número " + valor + " es par");
			}
			// Si el número de la posisción i no es divisible entre 2, el número es impar
			else {
				System.out.println("El número " + valor + " es impar");
			}
		}
		//Cerramos escaner
		sc.close();
	}
}
