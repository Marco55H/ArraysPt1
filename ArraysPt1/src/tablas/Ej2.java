package tablas;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// Creamos la tabla que permita valores decimales y la damos una logitud de 5
		double tabla[] = new double[5];

		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el número
			System.out.println("Introduce el número " + (i+1));
			// Vamos metiendo en las posiciones un número que elija el usuario
			tabla[i] = sc.nextDouble();
		}
		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Imprimimos el número que se encuentre en la posición i que haya introducido
			// el usuario
			System.out.println("El número " + (i+1)+ " es "+tabla[i]);

		}
		sc.close();
	}
}
