package funcionarray;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		// Creamos la tabla y la damos una logitud de 10
		int tabla[] = new int[10];
		// Creamos la variable 
		int suma;
		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Vamos metiendo en las posiciones un número 
			System.out.println("Introduce el número "+(i+1));
			tabla[i] = sc.nextInt();
		}
		//Le damos a la variable el resultado de la función
		suma=suma(tabla);
			
		//Damos el resultado
		System.out.println("La suma es "+suma);
		//Cerramos escaner
		sc.close();
	}
	
	//Función que nos devolverá la suma
	public static int suma(int tabla[]){
		//Variable de la suma
		int suma=0;
		
		// Metemos un for para contar desde 0 hasta la última posición de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Vamos sumando los datos de la tabla
			suma +=tabla[i] ;
		}
		//Devolvemos la suma total
		return suma;
	}
}
