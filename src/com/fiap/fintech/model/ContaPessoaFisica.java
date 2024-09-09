package com.fiap.fintech.model;

public class ContaPessoaFisica extends ContaBancaria{
    private String cpf;
    private double limiteEmprestimo;
    public ContaPessoaFisica(String numeroConta, Cliente titular, double saldo, String cpf, double limiteEmprestimo) {
        super (numeroConta, titular, saldo);
        this.cpf = cpf;
        this.limiteEmprestimo = limiteEmprestimo;

    }
    public void solicitarEmprestimo(double valorSolicitado){
        if (valorSolicitado <= limiteEmprestimo){
            saldo += valorSolicitado;
            System.out.println("Empréstimo de R$ " + valorSolicitado + "concedido com sucesso");
            return ;
        } System.out.println("Empréstimo negado, por gentileza entre em contato com seu gerente");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
}

