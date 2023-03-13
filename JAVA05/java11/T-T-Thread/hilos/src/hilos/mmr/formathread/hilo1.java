package hilos.mmr.formathread;

public class hilo1 extends Thread {
	public hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void run() {
		System.out.println("Se inicia el thread o hilo" + this.getName()+ "***");
		for (int i =0; i<10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Finaliza o termina el hilo" + this.getName() + "***");
		
	}

	

	

	}
