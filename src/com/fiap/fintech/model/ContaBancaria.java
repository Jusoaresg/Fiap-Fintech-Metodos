package com.fiap.fintech.model;

public class ContaBancaria {

	protected String numeroConta;
	protected Cliente titular;
	protected double saldo;

	// construtor com parametros
	public ContaBancaria(String numeroConta, Cliente titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}

