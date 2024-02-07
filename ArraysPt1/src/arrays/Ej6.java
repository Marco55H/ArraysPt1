package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		// Iniciamos Tabla de tamaño 1000
		int tabla[] = new int[1000];
		
		// Numero introducido por el usuario
		int num;
		
		// Contador de numeros repetidos
		int cont = 0;
		
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		
		//For para rellenar la tabla con numeros random
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
		}
		
		// Pedimos el número 
		System.out.println("Que número quieres buscar ");
		num = sc.nextInt();
		
		//Ordenamos la tabla
		Arrays.sort(tabla);
		
		//Recorremos la tabla y vamos comprobando si el número está
		for(int valor : tabla) {
			if(num == valor) {
				cont++;
				}
		}
		// Imprimimos el resultado
		System.out.println("Existe el número " + num + " en la tabla " + cont + " veces");
		
		// Cierro el Scanner
		sc.close();
	
	}

}
