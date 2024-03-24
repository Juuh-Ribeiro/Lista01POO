package com.Ex4;

public class Cliente {

	/*
	 * Implemente a classe Cliente que possua os atributos nome, saldo, e limite.
	 * Esta deve possuir tamb´em os m´etodos sacar(), depositar(), checarSaldo(), e
	 * obterNome(). Sabe-se que s´o ´e poss´ıvel sacar se o saldo+limite forem
	 * superiores `a quantia. Os m´etodos sacar() e depositar() necessitam de
	 * parˆametros. O m´etodo checarSaldo deve retornar o valor saldo+limite. O
	 * m´etodo obterNome() deve retornar o nome do Cliente.
	 */

	private String nome;
	private double saldo, limite;

	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void sacar(double quantia) {
		if (saldo + limite >= quantia) {
			saldo -= quantia;
			System.out.println("A quantia de: " + quantia + " foi sacada. Saldo restante: " + saldo);
		} else {
			System.out.println("Erro! Saldo insuficiente!");
		}

	}

	public void depositar(double quantia) {
		saldo += quantia;
		System.out.println("A quantia de: " + quantia + " foi depositada com sucesso!");
	}

	public double checarSaldo() {
		return saldo + limite;
	}

	public String obterNome() {
		return nome;
	}
}
