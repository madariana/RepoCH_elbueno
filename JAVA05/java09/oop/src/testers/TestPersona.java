package testers;

import oop.Persona;

public class TestPersona {
	public static void main(String[]args) {
		Persona p = new Persona();
		p.setNombre("Maria");
		System.out.println(">>>>>" + p.getNombre());
	Persona p0 = new Persona ("Pepe");
	System.out.println("-->" + p0.getNombre());
	}

}
