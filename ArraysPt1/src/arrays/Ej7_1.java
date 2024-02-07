package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ej7_1 {
	public static void main(String[] args) {
		// Contador que irá contando aciertos
		int acierto = 0;

		// creamos la tabla que tiene la combinación ganadora
		int resultado[] = { 1, 12, 13, 25, 33, 41 };

		// creamos la tabla que generará tu apuesta de forma aleatoria
		int apuesta[];

		// Iniciamos el random
		Random r = new Random();

		// Creamos la tabla y damos una longitud
		apuesta = new int[6];
		// Rellenamos la tabla y que no se puedan repetir los números
		for (int i = 0; i < apuesta.length; i++) {
			if (i > 0) {
				do {
					apuesta[i] = r.nextInt(1, 50);
					Arrays.sort(apuesta);
				} while (apuesta[i] == apuesta[i - 1]);
			} else {
				apuesta[i] = r.nextInt(1, 50);
				Arrays.sort(apuesta);
			}
		}

//Para contar el número de aciertos
		for (int i = 0; i < apuesta.length; i++) {
			for (int j = 0; j < apuesta.length; j++) {
				if (resultado[i] == apuesta[j]) {
					acierto += 1;
				}
			}
		}
		//Pintamos cuantos aciertos tenemos
		System.out.println("tienes " + acierto + " aciertos entre tu tabla " + Arrays.toString(apuesta)
				+ " y el resultado " + Arrays.toString(resultado));

	}
}
