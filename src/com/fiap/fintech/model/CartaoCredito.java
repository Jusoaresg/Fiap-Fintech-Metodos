package com.fiap.fintech.model;

public class CartaoCredito extends Cartao{
    protected double valorLimite;
    protected int parcelasFatura;
    protected double valorFatura;
    public CartaoCredito(String numeroCartao, ContaBancaria conta, double valorLimite, int parcelasFatura, double valorFatura ) {
        super(numeroCartao, conta);
        this.valorLimite = valorLimite;
        this.parcelasFatura = parcelasFatura;
        this.valorFatura = valorFatura;
    }
    //Método para pagamento com cartão de crédito

    public void pagarComCredito(double valorPagamento){
        if (valorPagamento <= 0){
            System.out.println("O valor deve ser positivo");
            return;
        }
        if (valorPagamento + this.valorFatura > this.valorLimite){
            System.out.println("Seu limite é insuficiente");
            return;
        }

        this.valorFatura += valorPagamento;
        System.out.println("Compra de" + valorPagamento + "no cartão de crédito autorizada! \nO valor atual da fatura é de R$ " + this.valorFatura);
    }
    //Método para parcelamento de fatura do cartão

    public void parcelarFatura(int numParcelas){
        if (numParcelas <=1){
            System.out.println("O número de parcelas deve ser maior que 1.");
            return;
        }
        parcelasFatura = numParcelas;
        double valorParcela = valorFatura / numParcelas;

        System.out.println("Fatura parcelada em " + numParcelas + "parcelas \nO valor de cada parcela é " + valorParcela);

    }
}

