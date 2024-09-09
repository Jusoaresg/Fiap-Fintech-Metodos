package com.fiap.fintech.main;

import com.fiap.fintech.model.*;
public class Teste {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Genilson Silva", "30010010050","genilson_silva@exemplo.com", "1234","Rua Limoeiro,123");
        ContaPessoaFisica contaPessoaFisica = new ContaPessoaFisica("454545454545", cliente, 1000, cliente.getCpf(), 500);
        ContaPessoaJuridica contaPessoaJuridica = new ContaPessoaJuridica("646464646464", cliente,10000,"35728000122");
        CartaoDebito cartaoDebito = new CartaoDebito("123456789", contaPessoaFisica);
        System.out.println("Cliente: " +cliente.getNome()+ " Saldo R$: " + contaPessoaFisica.getSaldo() + " Valor Disponível Empréstimo R$ " + contaPessoaFisica.getLimiteEmprestimo());
    }
}
