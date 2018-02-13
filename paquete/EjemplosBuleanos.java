package com.paquete;

public class EjemplosBuleanos {

	public static void main(String[] argumentos) {
		System.out.println("Ejemplos Buleanos");
		
		int x = 5;
		int y = 1;
		OperadoresComparacion (x,y);		
	}
	public static void OperadoresComparacion(int x,int y) {
		if (x == y)
			System.out.println(y + " Iguales " + y);
		if (x > y)
			System.out.println(x + " Mayor que " + y);
		if (y < x)
			System.out.println(y + " Menor que " + x);
		if (x != y)
			System.out.println(x + " Distinto de " + y);
		if (y <= x)
			System.out.println(y + " Menor o igual " + x);
		if (x >= y)
			System.out.println(x + " Mayor igual " + y);
		if (x > y)
			System.out.println(x + " Negacion " + y);
	}
		
}
