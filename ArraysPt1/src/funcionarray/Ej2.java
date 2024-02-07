package funcionarray;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// Creamos la tabla y la damos una logitud de 10
		int tabla[] = new int[10];
		// Creamos la variable que guardará el valor devuelto por la función
		int max;
		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Vamos metiendo en las posiciones un número 
			System.out.println("Introduce el número "+(i+1));
			tabla[i] = sc.nextInt();
		}
		//Le damos a la variable el resultado de la función
		max=maximo(tabla);
			
		//Damos el resultado
		System.out.println("El máximo es "+max);
		//Cerramos escaner
		sc.close();
	}
	
	//Función que nos devolverá la suma
	public static int maximo(int tabla[]){
		//Variable de la suma
		int max=-999999999;
		
		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Vamos comparando los datos de la tabla
			if(tabla[i]>max) {
				max=tabla[i];
			}
		}
		//Devolvemos el valos máximo
		return max;
	}
}
