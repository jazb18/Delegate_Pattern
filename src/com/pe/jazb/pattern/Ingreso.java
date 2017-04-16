package com.pe.jazb.pattern;

public class Ingreso extends OperacionesMatematicas {
	
	Organiza miorganiza; 
		
	public Ingreso() {
		miorganiza = new Organiza();
	}
	
	public void ingresar(double numero, double numero2 ){
		
		double menor = miorganiza.calculaMayor(numero, numero2);
		
		double mayor =  miorganiza.calculaMenor(numero, numero2);
		
		double division = dividir(numero, numero2);
		
		System.out.println("menor" + menor);
		
		System.out.println("mayor" + mayor);
		
		System.out.println("division" + division);
		
	}
	
}
