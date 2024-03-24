package com.ex7;

public class Eq2Grau {

	/*
	 * Implemente a classe Eq2Grau que possua: Atributos: a, b e c (doubles);
	 * M´etodos: delta(): retorna o delta da equa¸c˜ao; raiz1(): retorna a primeira
	 * raiz se ∆ ≥ 0, se n˜ao, retorna NaN; raiz2(): retorna a segunda raiz se ∆ ≥
	 * 0, se n˜ao, retorna NaN
	 */

	private double a, b, c;

	public Eq2Grau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double delta() {

		return Math.pow(b, 2) - (4 * a * c);
	}

	public double raiz1() {
		double delta = delta();
		if (delta < 0) {
			return Double.NaN;
		} else
			return (-b + Math.sqrt(delta)) / (2 * a);

	}

	public double raiz2() {
		double delta = delta();
		if (delta < 0) {
			return Double.NaN;
		} else
			return (-b - Math.sqrt(delta)) / (2 * a);

	}
}
