package tablas;

import java.util.Arrays;
import java.util.Random;

public class Ej1 {
	public static void main(String[] args) {
		// Creamos el random
		Random r = new Random();
		// Creamos la tabla y la damos una logitud de 10
		int tabla[] = new int[10];

		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Vamos metiendo en las posiciones un número aleatorio entre el 1 y el 100
			tabla[i] = r.nextInt(0, 101);
		}
		//Imprimimos el resultado, es decir la tabla
		System.out.println(Arrays.toString(tabla));
	}
}
