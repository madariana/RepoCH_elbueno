package com.mm.testers;

import com.mm.clases.AlumnoB;
import com.mm.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoB a = new AlumnoB(123, 8.5, "Juana", 20);
		Persona P b = new PersonaP("Ramon",18)
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
	}

}
