
package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {
															//declaramos las variables dentro de class "{___}" no fuera, puesto que no las reconocer�//
															//si queremos poner decimales ponemos "static float capital" o podemos poner solo unidades con " int ____= # "//
	static Scanner teclado;
	
	static float capital;
	static float precio = 7.5f;
	
	static float horaIda;	
	static float horaComienzaPelicula_1 = 18;
	static float horaComienzaPelicula_2 = 20;
	static float horaRecomendada;
	
		
	public static void main(String[] args) 
	{	
		String siContinuar;
		boolean resultadoCine;								//declaramos la variable con un nombre "boolean _______"//
		teclado = new Scanner (System.in);
		System.out.println("Programa Cine V4");				// el programa empezar� con el titulo//
		
		do { 
			pedirDatosDinero(); 								//Aqui llamamos a la funcion, sin esta no funcionar� lo siguiente, (invocamos a la funcion)//
			pedirDatosHora();
			resultadoCine = comprobarSiVamosAlCine();			//esto devuelve un valor//
			mostrarResultado(resultadoCine);
			teclado.nextLine();
			siContinuar = teclado.nextLine();
		}
		while (siContinuar.equals("s") || siContinuar.equals("S"));
		teclado.close(); //teclado.close(); con esto cerraremos el resultado//
	}
	public static void pedirDatosDinero() 
	{//ponemos la funcion a la que hemos llamado antes//
	//el programa har� caso a la variable que esta dentro del bloque si esta tambien fuera, no puede repetirse fuera y dentro del bloque//
		
		System.out.println("Introduzca su capital: ");
		capital = teclado.nextFloat();
	}	
	public static void pedirDatosHora()
	{
		System.out.println("Introduzca su horario: ");		
		horaIda = teclado.nextInt();
	}
	public static boolean comprobarSiVamosAlCine()			//dar� error el "boolean" si no se pone	acontinuacion "return =false/true"//
	{
		if (capital >= precio) {
			if (horaIda >= horaComienzaPelicula_1 - 1 && horaIda <= horaComienzaPelicula_1) {
				horaRecomendada = horaComienzaPelicula_1;
		return true;
		}
			else if (horaIda >= horaComienzaPelicula_2 - 1 && horaIda <= horaComienzaPelicula_2) {
					horaRecomendada = horaComienzaPelicula_2;
					return true;							
			}
		}
		return false;
	}		
	public static void mostrarResultado(boolean resultado) {																
		if (resultado == true) 
		{
			System.out.println ("S� que podemos ir al cine");
		}else {
			System.out.println ("No podemos ir al cine");	
		}
		
	}
	

}



