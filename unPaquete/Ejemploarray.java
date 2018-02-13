package unPaquete;

public class Ejemploarray {
	public static void main (String [] args) {
		int[] arrayEnteros;
		arrayEnteros = new int [3];
		arrayEnteros [0] = 7;
		arrayEnteros [1] = 9;
		arrayEnteros [2] = 11;
		arrayEnteros [3] = 12;
		arrayEnteros [4] = 1;
		
		//Bucle for (inicializacion condicion interaccion//
		
		for (int i = 0; i < arrayEnteros.length; i = i + 1) {
			arrayEnteros [i]= i*i;	 //con esto podemos elevarlo al cuadrado el numero //		
			System.out.println("Array ("   +   i  + "):  " + arrayEnteros [i]);	
		}
		float [] decimales = new float [3];
		for (int j=0; j<decimales.length; j++)  /* lo convertimos en decimal */
		{
			decimales [j]= (float) j /3f;
			System.out.println("El tercio de: " +j+ " es " + decimales [j]);
		}
		int otroArray [] = {5, 10, 15, 20, 25};
		for (int elemento : otroArray) {
			System.out.println ("Elemento: " + elemento);
		}	
		String [] dias = {"Lunes" , "Martes" , "Miercoles" , "Jueves" , "Viernes" , "Sabado" , "Domingo"};
		for (String dia: dias) {
			System.out.println (dia);	
			
		/*for (int d=0; d<dias; length; d++)
		 * String dia = dias [d];
		 * System.out.println (dia); */
		}
		int numDia = 0;
		while (numDia < dias.length) {
			System.out.println (dias [numDia]);
			numDia ++;
		}
		int numeDia = dias.length - 1;
		while (numDia >= 0) {
			System.out.println (dias [numDia]);
			numeDia = numeDia - 1;
		
		}
	
	/*void mostrarDias () {
		* String [] dias = {"Lunes" , "Martes" , "Miercoles" , "Jueves" , "Viernes" , "Sabado" , "Domingo"};
		* int numeDia = dias.length - 1;
		* while (numDia >= 0) {
		*	System.out.println (dias [numDia]);
		*	numeDia = numeDia - 1;*/
		}
}
