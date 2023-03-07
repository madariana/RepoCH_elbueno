package com.generation.mmr.clases;

public class Taco {
	private String tipoDeTortilla;
	private String Guisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float Precio;


public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
	super();
	this.tipoDeTortilla = tipoDeTortilla;
	this.Guisado = guisado;
	this.numeroDeTortilla = numeroDeTortilla;
	this.tamanioDeTortilla = tamanioDeTortilla;
	Precio = precio;
}

@Override
public String toString() {
	return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla=" + numeroDeTortilla
			+ ", tamanioDeTortilla=" + tamanioDeTortilla + ", Precio=" + Precio + "]";
}




}


