package funcionarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Variable para marcar cuál será el número máximo
		int fin;
		// Variable que nos dará la longitud de la tabla
		int longitud;
		// Para guardar la tabla que devolverá la función
		int tabla[];
		// Pedimos el número máximo
		System.out.println("¿Cuál será el número máximo que podrá aparecer en tu tabla? ");
		fin = sc.nextInt();

		// Pedimos la longitud
		System.out.println("¿Cuál será la longitud de tu tabla? ");
		longitud = sc.nextInt();

		tabla = darPares(longitud, fin);
		System.out.println(Arrays.toString(tabla));
	}

	// Funcion que se encargará de devolver
	public static int[] darPares(int longitud, int fin) {
		// Creamos la tabla en esta función
		int tabla[];
		// Le damos longitud a la tabla
		tabla = new int[longitud];
		// creamos el random
		Random ran = new Random();

		for (int i = 0; i < tabla.length; i++) {
			// Vamos metiendo en las posiciones un número y comprobamos que sean pares con
			// un do while
			do {
				System.out.println("Número " + (i + 1));
				tabla[i] = ran.nextInt(0,fin+1);
			} while (tabla[i] % 2 != 0);
		}

		return tabla;
	}
}
