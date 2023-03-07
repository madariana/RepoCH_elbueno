package com.generation.mmr.clases;

public class Persona {
	private String nombre;
	private int edad;
	private int nss;
	//atributes
	public Persona() {
		
	}
	//constructor vacio
	public Persona(String nombre, int edad, int nss) {
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}
	
	//Constructor sobrecargado
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre
(String nombre) {
		this.nombre = nombre;
		
	}
	
	public int getEdad() {
		return edad;
	}
}

