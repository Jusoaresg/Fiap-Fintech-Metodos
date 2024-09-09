package com.fiap.fintech.model;

public class Cartao {
    protected String numeroCartao;
    protected ContaBancaria conta;

    // Construtor padrão
    public Cartao() {
    }

    //Construtor com parâmetros
    public Cartao(String numeroCartao, ContaBancaria conta) {
        this.numeroCartao = numeroCartao;
        this.conta = conta;
    }
}

