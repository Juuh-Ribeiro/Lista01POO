package com.ex9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente("Taylor", 2550.0, 350.0);
		Cliente cliente2 = new Cliente("Sabrina", 250.0, 500.0);
		
		System.out.println("Cliente: " + cliente.obterNome());
		System.out.println("Saldo + limite da conta: " + cliente.checarSaldo());
		
		cliente.sacar(2000);
		System.out.println("Cliente: " + cliente.obterNome());
		System.out.println("Saldo + limite da conta: " + cliente.checarSaldo());
		
		cliente.depositar(25000);
		System.out.println("Cliente: " + cliente.obterNome());
		System.out.println("Saldo + limite da conta: " + cliente.checarSaldo());
		
		Transferir.transferir(cliente2, cliente, 500);
	}

}
