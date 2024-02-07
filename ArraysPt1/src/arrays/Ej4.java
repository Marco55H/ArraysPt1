package arrays;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		// Iniciamos la tabla de tamaño 30
		int tabla[] = new int[30];


		//For para rellenar la tabla co numeros random
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}

		// Ordeno la tabla 
		Arrays.sort(tabla);

		// Imprimo la tabla
		System.out.println(Arrays.toString(tabla));

	}

}
