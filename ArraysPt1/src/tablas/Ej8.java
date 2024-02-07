package tablas;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		//Para guardar el número que quieres ver
		int num;
		//Creamos la tabla
		int tabla[] = new int[100];
		//Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		//Creamos una tabla random numeros del 1 al 10
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (1 + Math.random() * 10);
		}
		//preguntamos el número que quiere ver
		System.out.println("¿Que número quieres ver?");
		num=sc.nextInt();
		//comprobamos qel el número sea válido
		if(num<0||num>10) {
			System.out.println("El número introducido no está en el rango posible");
		}
		//Buscamos el número y si aparece lo indicamos junto con su posición
		for(int i=0;i< tabla.length;i++) {
			if(tabla[i]==num) {
				System.out.println("Tienes un número " +num+ " en la posición " +i);
			}
		}
		//Cerramos escaner
		sc.close();
	}
}
