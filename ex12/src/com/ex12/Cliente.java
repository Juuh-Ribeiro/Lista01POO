package com.ex12;

public class Cliente {

	/*
	 * Implemente a classe Cliente que contenha os atributos: nome, cpf (Strings) e
	 * telefone (Telefone). E que contenha os metodos: mostrarDados() e
	 * adicionarTelefone() o primeiro deve mostrar todos os dados do cliente
	 * incluindo o telefone e o ultimo deve associar um novo telefone ao cliente.
	 * Implemente a classe Telefone que possua os atributos: ddd e numero (Strings)
	 * e os metodos: obterNumero() e obterDDD().
	 */

	private String nome, cpf;
	Telefone telefone;

	public Cliente(String nome, String cpf, Telefone telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: (" + telefone.getDdd() +")"+ telefone.getTelefone());
	}

	public void adicionarTelefone(Telefone adicionarTelefone) {
		this.telefone = adicionarTelefone;
		System.out.println("Telefone adicionado com sucesso!");
		System.out.println("Telefone: (" + adicionarTelefone.getDdd() +")"+ adicionarTelefone.getTelefone());
	}
}
