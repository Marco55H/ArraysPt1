package funcionarray;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		// Creamos la tabla
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Creamos la variable dato para introducir el número que quiere buscary despues
		// será el valos devuelto por la función
		int dato;
		// Pedimos el dato que se quiere encontrar
		System.out.println("¿Que dato quieres buscar?");
		dato = sc.nextInt();

		// LLamamos a la funcion
		dato = buscar(tabla, dato);
		// si dato es igual a -1 el valor no se encuentra en la tabla
		if (dato > -1) {
			System.out.println("Tu dato que has buscado esta en la posición " + dato);
		} else {
			System.out.println("Tu dato no se encuentra en la tabla");
		}
		sc.close();
	}
//Función que se encarga de devolver la posición de el dato
	public static int buscar(int tabla[], int dato) {
		
		//Valor que devolvemos, lo usamos primero contador y después para guardar la posición
		int indice = 0;
		
		//While que nos devolverá la posición del dato si se encuentra
		while (indice < tabla.length && dato != tabla[indice]) {

			indice++;
		}

		//If por si el indice supera la longitud de la tabla, es decir que no lo encontramos
		if (indice >= tabla.length) {
			 indice=-1;
		}

		//Devolvemos la posición
		return indice;
	}
}