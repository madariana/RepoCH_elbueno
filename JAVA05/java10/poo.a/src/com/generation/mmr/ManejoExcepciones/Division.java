package com.generation.mmr.ManejoExcepciones;

public class Division {
	private int numerador;
	private int denominador;
	
	public Division(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarD() {
		System.out.println("el resultado de la division es" + this.numerador/this.denominador);
		
	}
}
