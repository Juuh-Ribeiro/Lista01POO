package com.ex9;

public class Cliente {
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
