package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(divisible);
	public void controlIf() {
		
		
		long nota = 6;
		if (nota>5) {
			System.out.println("Nota aprobada " + nota);
		}
		System.out.println("Continua el control de flujo");
		
		//if else
		if (nota >=5) {
			System.out.println("Nota aprobada " + nota);
		}
		else {
			System.out.println("Nota no aprobada " + nota);
		}
		
		


		//Dado dos enteros, nos dice si el primero es divisible en el segundo
		public static void divisible() {
			System.out.println("Introduzca un primer número: ");
			int dato1 = entrada.nextInt();
			System.out.println("Introduzca un segundo número: ");
			int dato2 = entrada.nextInt();
			if (dato1 % dato2 ==0) {
				System.out.println(dato1 + "es divisible entre " + dato2);
			} else {
				System.out.println(dato1 + "no es divisible entre " + dato2);;
			}
					
				}
		public void compara() {
			System.out.print("Introduzca un primer numero: ");
			
			
		}
		
		
			
			
	}
}
	
