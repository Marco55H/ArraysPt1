package funcionarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		// Creamos la tabla
		int tabla[] = { 2, 2, 3, 5, 5, 5, 8, 8, 9, 10 };
		// Creamos la variable dato para introducir el número que quiere buscar
		int dato;

		// Será el resultado
		int tablaVuelta[];
		// Pedimos el dato que se quiere encontrar
		System.out.println("¿Que dato quieres buscar?");
		dato = sc.nextInt();

		// LLamamos a la funcion
		tablaVuelta = buscar(tabla, dato);

		System.out.println("Ese número se repite en las posiciones " + Arrays.toString(tablaVuelta));

	}

//Función que se encarga de devolver la posición de el dato
	public static int[] buscar(int tabla[], int dato) {

		// Valor que devolvemos, lo usamos primero contador y después para guardar la
		// posición
		int tablilla[];
		int longitud = 0;
		int y = 0;
		// for que nos devolverá la posición del dato si se encuentra
		for (int i = 0; i < tabla.length; i++) {
			if (dato == tabla[i]) {
				longitud++;
			}

		}

		tablilla = new int[longitud];

		// While que nos devolverá la posición del dato si se encuentra
//		for (int i = 0; i < tablilla.length; i++) {
//			if (dato == tabla[i]) {
//
//				tablilla[i] = i;
//
//			}			if(dato!=tabla[0]) {
//		
//				  tablilla[i] notequals.y ;
//			}
//
//		}
//
		for (int i = 0; i < tablilla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				if (dato == tabla[j]) {

					tablilla[i] = j;
				}

			}

		}
		return tablilla;
	}
}