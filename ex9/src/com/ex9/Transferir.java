package com.ex9;

public class Transferir {

	public static void transferir(Cliente c1, Cliente c2, double quantia) {

		if (c2.checarSaldo() >= quantia) {
			c2.sacar(quantia);
			c1.depositar(quantia);

			System.out.println("Transferencia de: " + quantia + " realizada com sucesso de " + c2.obterNome() + " para "
					+ c1.obterNome());

		} else {
			System.out.println("Erro! Saldo insuficiente");
		}
	}

}
