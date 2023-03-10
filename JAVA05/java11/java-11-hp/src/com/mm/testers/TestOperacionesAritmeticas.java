package com.mm.testers;

import com.mm.clases.Suma;

public class TestOperacionesAritmeticas {
public static void main(String [] args) {
	Suma s = new Suma (5,2);
	OperacionesAritmeticas ss = new Suma(10,3);
	
	System.out.println("Suma" +s.sumar());
	System.out.println("Operaciones Aritmeticas" + ss.sumar());
	
}
}
