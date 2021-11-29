package org.generation.ital.utils;

public class CalcoliHelper {
	
	// Viene applicato l'overload di metodi
	
	public static int Somma(int a, int b) {
		return a+b;
	}
	
	public static double Somma(double a,double b) {
		return a+b;
	}
	
	public static int Differenza(int a, int b) {
		return a-b;
	}
	
	public static double Differenza(double a, double b) {
		return a-b;
	}
	
	public static int Moltiplicazione(int a, int b) {
		return a*b;
	}
	
	public static double Moltiplicazione(double a, double b) {
		return a*b;
	}
	
	public static int ValoreAssoluto(int a) {
		if(a < 0) {
			a= -a;
		}
		return a;
	}
	
	public static double ValoreAssoluto(double a) {
		if(a < 0) {
			a= -a;
		}
		return a;
	}
	
	public static int Min(int a, int b) {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static double Min(double a, double b) {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int Max(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static double Max(double a, double b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static double Potenza(int a, int b) {
		int potenza=1;
		if (a == 0 && b == 0) {
			System.out.println("Impossibile calcolare la potenza");
			return 0;
		}else if(a == 0) {
			return 0;
		}
		
		for(int i = 0; i < ValoreAssoluto(b); i++) {
			potenza *= a;
		}
		
		if (b < 0) {
			double potenzaDouble = potenza;
			return 1/potenzaDouble;
		}else {
			return potenza;
		}
	}
}
