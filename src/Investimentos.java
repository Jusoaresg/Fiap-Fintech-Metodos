public class Investimentos {
    private String investimentoId;
    private double valor;
    private String tipo; // Ex: "Ações", "Fundos", etc.
    private String dataInvestimento;
    private String dataResgate;

    // Construtor padrão
    public Investimentos() {
    }

    // Construtor com parâmetros
    public Investimentos(String investimentoId, double valor, String tipo, String dataInvestimento, String dataResgate) {
        this.investimentoId = investimentoId;
        this.valor = valor;
        this.tipo = tipo;
        this.dataInvestimento = dataInvestimento;
        this.dataResgate = dataResgate;
    }

    // Método para realizar investimento
    public void realizarInvestimento() {
        System.out.println("Realizando investimento de " + valor + " em " + tipo);
    }
}
