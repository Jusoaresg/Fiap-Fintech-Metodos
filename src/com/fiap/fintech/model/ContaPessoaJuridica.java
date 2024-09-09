package com.fiap.fintech.model;

public class ContaPessoaJuridica extends ContaBancaria{
    private String cnpj;
    public ContaPessoaJuridica(String numeroConta, Cliente titular, double saldo, String cnpj) {
        super (numeroConta, titular, saldo);
        this.cnpj = cnpj;

    }
}

