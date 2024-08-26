public class Cartao {

    private String tipoCartao;
    private String numeroCartao;
    private double valorLimite;
    private double valorFatura;
    private int parcelasFatura;
    private ContaBancaria conta;

    // Construtor padrão
    public Cartao(){
    }

    //Construtor com parâmetros
    public Cartao(String tipoCartao, String numeroCartao, ContaBancaria conta, double valorLimite, double valorFatura, int parcelasFatura){
        this.tipoCartao = tipoCartao;
        this.numeroCartao = numeroCartao;
        this.valorLimite = valorLimite;
        this.valorFatura = valorFatura;
        this.parcelasFatura = parcelasFatura;
        this.conta = conta;
    }

    //Criando um objeto "cartão para uso
    // Cartao cartao = new Cartao("Crédito", "1234-5678-0000-0000", Objeto contaBancaria, 5000.0, 9000.0, 0)

    //Método para pagamento com cartão de crédito

    public void pagarComCredito(double valorPagamento){
        if (valorPagamento <= 0){
            System.out.println("O valor deve ser positivo");
            return;
        }
        if (valorPagamento + valorFatura > valorLimite){
            System.out.println("Seu limite é insuficiente");
            return;
        }

        valorFatura += valorPagamento;
        System.out.println("Compra de" + valorPagamento + "no cartão de crédito autorizada! \nO valor atual da fatura é de R$ " + valorFatura);
    }
    //Exemplo de pagamento com cartão de crédito: meuCartao.pagarComCrédito(650.99);


    //Método para pagamento com cartão de débito

    public void pagarComDebito(double valorDebito){
        if (valorDebito > conta.getSaldo()){
            System.out.println("Saldo insuficiente");
            return;
        }
        if (valorDebito <= 0){
            System.out.println("O valor deve ser positivo");
            return;
        }
        conta.setSaldo( conta.getSaldo() - valorDebito );
        System.out.println("Compra realizada. Novo saldo de: " + this.conta.getSaldo());
    }
    //Exemplo de pagamento com cartão de débito: meuCartao.pagarComDebito(120.00);


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
    //Exemplo de Parcelamento de Fatura: meuCartao.parcelarFatura(3);
