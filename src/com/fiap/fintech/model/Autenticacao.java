package com.fiap.fintech.model;

import java.util.HashMap;
import java.util.Map;

public class Autenticacao {

	// <Cpf, Cliente obj>
	Map<String, Cliente> clientesRegistrados = new HashMap<String, Cliente>();

	public Cliente registrarCliente(String nome, String cpf, String email, String password, String endereco) {

		Cliente cliente = new Cliente(nome, cpf, email, password, endereco);

		if (clientesRegistrados.containsKey(cpf)) {
			System.out.println("Cliente já registrado nesse cpf");
			return null;
		}

		clientesRegistrados.put(cliente.getCpf(), cliente);

		System.out.println("Cliente criado com sucesso");
		return cliente;

	}

	public Cliente login(String cpf, String password) {

		Cliente cliente = clientesRegistrados.get(cpf);

		if (cliente == null) {
			System.out.println("Cliente não registrado");
			return null;
		}

		if (!cliente.checkPassword(password)) {
			System.out.println("Senha errada, tente novamente");
			return null;
		}

		System.out.println("Cliente logado com sucesso");
		return cliente;
	}

}
