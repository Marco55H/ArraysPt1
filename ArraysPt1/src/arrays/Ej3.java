package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		// Número introducido del uuario
		int numero;

		// Tabla principal
		int tabla[] = new int[20];

		// Los 10 primeros numeros de la tabla principal
		int tablita1[] = new int[10];

		// Los 10 últimos numeros de la tabla principal
		int tablita2[] = new int[10];

		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);

		// for para Rellenar la tabla principal
		for (int i = 0; i < tabla.length; i++) {
			// Pedimos el número
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			tabla[i] = numero;
		}

		// los 10 primeros números los metemos en la tabla 1
		tablita1 = Arrays.copyOfRange(tabla, 0, 10);
		System.out.println(Arrays.toString(tablita1));
		// los 10 siguientes en otra tabla
		tablita2 = Arrays.copyOfRange(tabla, 10, 20);
		System.out.println(Arrays.toString(tablita2));

		// Comparamos  Arrays
		if (Arrays.equals(tablita1, tablita2)) {
			System.out.println("Las dos tablas son iguales.");
		} else {
			System.out.println("Las dos tablas son diferentes.");
		}

		// Cierramos el Scanner
		sc.close();
	}

}
