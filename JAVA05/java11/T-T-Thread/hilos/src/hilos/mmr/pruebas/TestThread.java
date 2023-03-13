package hilos.mmr.pruebas;

import hilos.mmr.formathread.hilo1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h = new hilo1 ("Juana");
		System.out.println(h.getState());
	}

}
