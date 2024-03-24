package com.ex12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefone telefone1 = new Telefone("13", "123456789");
		Cliente cliente1 = new Cliente("Taylor", "123.456.789-00", telefone1);

		cliente1.mostrarDados();

		Telefone novotel = new Telefone("13", "987654321");
		cliente1.adicionarTelefone(novotel);
		cliente1.mostrarDados();

	}

}
