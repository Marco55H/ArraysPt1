package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
public static void main(String[] args) {
	// Creamos el escaner
	Scanner sc = new Scanner(System.in);
	// Creamos la tabla y le damos una logitud de 10
	int tabla[] = new int[10];

	//Metemos un for para contar desde 0 hasta la última posición de la tabla
	for (int i = 0; i < tabla.length; i++) {
		// Pedimos el número
		System.out.println("Introduce el número " + (i+1));
		// Vamos metiendo en las posiciones un número que elija el usuario
		tabla[i] = sc.nextInt();
	}
	//Metemos un for para contar desde la última posición de la tabla hatsa el 0
	for (int i = tabla.length-1; i >= 0; i--) {
		// Imprimimos el número que se encuentre en la posición i que haya introducido
		// el usuario
		System.out.println("El número " + (i+1)+ " es "+tabla[i]);

	}
	System.out.println(Arrays.toString(tabla));
	sc.close();
}
}

