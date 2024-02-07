package tablas;

import java.util.Arrays;

public class Ej4 {
public static void main(String[] args) {
	//Iniciamos Array
	int tabla[] = new int[12];
	//Añadimos los valores a la tabla en sus posiciones
	tabla[0]=39;
	tabla[1]=-2;
	tabla[4]=0;
	tabla[6]=14;
	tabla[8]=5;
	tabla[9]=120;
	//Pintamos la tabla
	System.out.println(Arrays.toString(tabla));
}
}
