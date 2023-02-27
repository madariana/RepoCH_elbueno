package tiposDeDatosYVariables;

public class java04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		// Ejercicios
		
/* Verificar si un número es par y positivo*/
		
		int numero = 7;
		boolean esPositivoYMenorQue10 = numero > 0 && numero % 2 == 0;
		System.out.println(esPositivoYMenorQue10); 
		
/* Verificar si un número está dentro de un rango específico
int num = 10; */		
		int numero2 = 10;
		boolean estaDentro = numero2 >5 && numero2 <15;
		System.out.println(estaDentro);
		
/* Verificar si una cadena es igual a otra o no */
		String cadena1 = "Hola";
		String cadena2 = "hola";
		boolean esIgual = cadena1 == cadena2;
		System.out.println(esIgual);
		
		
		
		
	}

}
