package com.paquete;

public class EjemplosFunciones {

	public static void main(String[] args) {
		System.out.println("V3 - Programa Cine");
		// Empezando 
		int x = 8;
		int y = 10;
		x = 8;
		y = 10;
		int resultadoSuma = sumarNumeros(x,y);
		int resultadoResta = restarNumeros (x,y);
		int resultadoElevar = elevarNumeros (x);
		int resultadoElevar2 = elevarNumeros2 (x);
		
		System.out.println ("Resultado = " + resultadoSuma);
		System.out.println ("Resultado = " + resultadoResta);
		System.out.println ("Resultado = " + resultadoElevar);
		System.out.println ("Resultado = " + resultadoElevar2);
		
	}
	public static int sumarNumeros (int valor_1, int valor_2) {
		return valor_1 + valor_2;
	}
	public static int restarNumeros (int valor_1, int valor_2) {
		return valor_1 - valor_2;
	}
	public static int elevarNumeros (int valor_1) {
		return valor_1 * valor_1 ;
	}
	public static int elevarNumeros2 (int valor_1) {
		return valor_1 * valor_1 * valor_1;
	}
	public static double alCubo (int parametro) {
		double result = Math.pow (parametro, 3);
		return result;
	}
}
