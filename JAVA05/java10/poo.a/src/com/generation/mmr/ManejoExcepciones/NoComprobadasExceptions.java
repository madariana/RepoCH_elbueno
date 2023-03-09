package com.generation.mmr.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
public static void main(String[] args) {
	
	Scanner dato = new Scanner(System.in);
	System.out.println("Introduzca un valor");
	int divisor;
	
	
	try {
		divisor = Integer.parseInt(dato.next());
		int division = 10/0;
		System.out.println("--->"+division);
	
	
	
	}catch (ArithmeticException e) {
		System.out.println("capturando la exception"+e.getMessage());
		
	}catch (NumberFormatException nfe) {
	System.out.println("el dato es un caracter" + nfe.getMessage());	
	}
	finally {
		System.out.println("este bloque es opcional y se ejecuta con o o sin la expeción");
		
		
	}
	
	System.out.println("continuamos con el flujo de la aplicación");
}
}

