package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		// Iniciamos la tabla
		int tabla[];
		// Variable que usaremos para darle una longitud al array
		int longitud;
		// Variable que usaremos para rellenar el array
		int num;
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		// Preguntamos el tamaño del array
		System.out.println("¿Cuanto tamaño quieres en el array?");
		longitud = sc.nextInt();
		// Le damos al array el tamaño del número dado
		tabla = new int[longitud];
		// Preguntamos al usuario de que n úmero quiere llenar el array
		System.out.println("De que número quieres llenar tu array?");
		num = sc.nextInt();

		//Hacemos un array fill para rellenar la tabla del numero elegido
		Arrays.fill(tabla, num);

		// Imprimimos el resultado, es decir la tabla
		System.out.println(Arrays.toString(tabla));
		sc.close();

	}
}
