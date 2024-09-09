package com.fiap.fintech.model;

import java.util.List;

public class Cliente {
	private String nomeCliente;
	private String cpf;
	private String email;
	private String password;
	private String endereco;

	private List<Cartao> cartoes;
	private List<ContaBancaria> contas;
	private List<Emprestimos> emprestimos;

	// Construtor para inicializacao dos atributos
	public Cliente(String nomeCliente, String cpf, String email, String password, String endereco) {
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.email = email;
		this.password = password;
		this.endereco = endereco;
	}

	// metodo para retornar o nome do cliente
	public String getNome() {
		return nomeCliente;
	}

	// metodo checagem da senha
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

	// metodo retornar cpf
	public String getCpf() {
		return this.cpf;
	}

	// metodo para retornar as contas
	public List<ContaBancaria> getContas() {
		return contas;
	}

	// metodo para abertura de novas contas
	public void abrirConta(ContaBancaria novaConta) {
		contas.add(novaConta);
	}

	// metodo para emitir cartoes
	public void emitirCartao(Cartao novoCartao) {
		cartoes.add(novoCartao);
	}
}
