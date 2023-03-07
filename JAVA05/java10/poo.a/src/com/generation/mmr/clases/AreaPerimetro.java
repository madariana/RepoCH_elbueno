package com.generation.mmr.clases;

public class AreaPerimetro {
	
	public double area(double lado) {
		double area = lado*lado;
		return area;
	}
	public double perimetroCuadrado(double lado) {
		double perimetro = lado*4;
		return perimetro;
	}
	public double areaTriangulo(int base, int altura) {
		return base * altura / 2;
	}
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		return (ladoA + ladoB + ladoC);
	}
	
	public double perimetroCirculo(double radio) {
		return 2 * Math.PI * radio;
	}
	
	public double areaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
}
