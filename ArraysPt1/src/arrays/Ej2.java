package arrays;

import java.util.Arrays;

public class Ej2 {
	public static void main(String[] args) {
		//Iniciamos la tabla
		int tabla[]= new int[55];
		//Variable que la que iremos guardadndo el primer número del grupo(3,3,3)
		int primero=0;
		//Variable que la que iremos guardadndo el primer número del grupo(3,3,3)
		int ultimo=0;
		//For para calcular con que tenemos que rellenar la tabla
		for(int i=1;i<=10;i++) { 
			//Lo lenamos según esta formula
			Arrays.fill(tabla, primero, ultimo+1,  i );
			ultimo = ultimo + i+1;
			primero = primero + i;
         
					
		}
		//Pintamos la tabla
		System.out.println(Arrays.toString(tabla));
	}
}
