package com.ex7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// raizes diferentes
		Eq2Grau eq1 = new Eq2Grau(1, -3, 2);
		System.out.println("Delta: " + eq1.delta());
		System.out.println("Raiz 1: " + eq1.raiz1());
		System.out.println("Raiz 2: " + eq1.raiz2());

		// raizes iguais
		Eq2Grau eq2 = new Eq2Grau(2, -4, 2);
		System.out.println("Delta: " + eq2.delta());
		System.out.println("Raiz 1: " + eq2.raiz1());
		System.out.println("Raiz 2: " + eq2.raiz2());

		// raizes nao existentes
		Eq2Grau eq3 = new Eq2Grau(1, 2, 3);
		System.out.println("Delta: " + eq3.delta());
		System.out.println("Raiz 1: " + eq3.raiz1());
		System.out.println("Raiz 2: " + eq3.raiz2());

	}

}
