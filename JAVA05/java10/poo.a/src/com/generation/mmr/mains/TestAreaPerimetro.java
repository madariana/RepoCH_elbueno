package com.generation.mmr.mains;

import com.generation.mmr.clases.AreaPerimetro;
import com.generation.mmr.clases.FigurasGeometicas;

public class TestAreaPerimetro {
	public static void main (String[]args) {
		AreaPerimetro ap= new AreaPerimetro();
		FigurasGeometicas fg = new FigurasGeometicas();
		
		
		fg.setArea(ap.area(5));
		System.out.println("Area cuadrado---->"+ fg.getArea());
		
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("Perimetro del cuadrado-->" + fg.getPerimetro());

		fg.setArea(ap.areaCirculo(5));
		System.out.println("Area del ciculo-->" + fg.getArea);
}
}
