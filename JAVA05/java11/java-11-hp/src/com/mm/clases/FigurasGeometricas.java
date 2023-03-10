package com.mm.clases;

public class FigurasGeometricas {
	private String nombre;

	public FigurasGeometricas(String nombre) {
		super();
		this.nombre = nombre;

	}
	
	public abstract double areas();

	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


		
	}
	
	



}
