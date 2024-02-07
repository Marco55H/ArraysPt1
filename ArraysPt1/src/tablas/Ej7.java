package tablas;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		//Creo la tabla con 12 espacios
		int tabla[] = new int[12];
		//Creo otra tabla para los nombres de los meses
		String meses[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		//Inicio el escaner
		Scanner sc = new Scanner(System.in);

		//for para ir añadiendo los valores desde el 1 al 12
		for (int i = 0; i < tabla.length; i++) {
			//Vamos leyendo las temperaturas
			System.out.println("Que temperaturas teníamos en " + meses[i]);
			tabla[i] = sc.nextInt();
		}
		//For para pintar el resultado
		for (int i=0;i<tabla.length;i++) {
			System.out.print(meses[i] + " :  \t");
			for (int f = 0; f <tabla[i] ; f++) {
				System.out.print("#");
			}
			System.out.println();
		}
		//Cerramos escaner
		sc.close();
	}
}
