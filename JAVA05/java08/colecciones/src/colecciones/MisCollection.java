package colecciones;

import java.util.ArrayList;
import java.util.List;

public class MisCollection {
	
	public static void main (String[]args) {
		MisCollection c = new MisCollection();
		//wrapperClass();
		//imprimir(c.listaCollections());
	}
	public void listasCollections() {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
	}
	private static void mapCollections() {
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		//miMap.clear();	
		miMap.remove("valor3");
		//System.out.println("El mapa esta vacio: "+miMap.isEmpty());
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		
		
	}
	
	Set setCollections() {		
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.add("cinco");
		miSet.add("uno");
		
		
		return miSet;

		}
	
	
	List listaCollections() {
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());
		miLista.add("1");
		miLista.add(0, 2);
		miLista.add(3);
		miLista.add(0, "Pato");
		miLista.set(0, miLista);
		miLista.remove(2);
		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		boolean e = miLista.contains(3);
		System.out.println("--->" + e);

		return miLista;

	}
	
	private static void imprimir(Collection collection) {
		// TODO Auto-generated method stub
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
		}
	}

	
		
		static void wrapperClass() {
		byte numeroB = -128;
		System.out.println("Tamaño de un byte" + Byte.SIZE);
		System.out.println("Valor Max" + Byte.MAX_VALUE);
		System.out.println("Valor Min" + Byte.MIN_VALUE);
		System.out.println("--->" + numeroB);
		
		int numeroI = -2147483648;
		System.out.println("Tamaño de un entero byte:" + Byte.SIZE);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor MAX");
		System.out.println("Valor Min" + Integer.MIN_VALUE);
		System.out.println("--->" + numeroB);
		System.out.println("--->" + numeroI);
			
		
		
        short numeroS = 0;
        System.out.println("Tamaño de un short en bytes: "+Short.BYTES);
        System.out.println("Tamaño de un short: "+Short.SIZE);
        System.out.println("Valor Maximo "+Short.MAX_VALUE);
        System.out.println("Valor Min"+Short.MIN_VALUE);
        System.out.println("----->"+numeroS);
        System.out.println("--->"+numeroS);
        long numeroL = 0;
        System.out.println("Tamaño de un Long en bytes: "+Long.BYTES);
        System.out.println("Tamaño de un Long: "+Long.SIZE);
        System.out.println("Valor Maximo "+Long.MAX_VALUE);
        System.out.println("Valor Min"+Long.MIN_VALUE);
        System.out.println("----->"+numeroL);
        System.out.println("--->"+numeroL);
        float numerof = 0;
        System.out.println("Tamaño de un float en bytes: "+Float.BYTES);
        System.out.println("Tamaño de un float: "+Float.SIZE);
        System.out.println("Valor Maximo "+Float.MAX_VALUE);
        System.out.println("Valor Min"+Float.MIN_VALUE);
        System.out.println("----->"+numerof);
        System.out.println("--->"+numerof);
		}

		
		
}
