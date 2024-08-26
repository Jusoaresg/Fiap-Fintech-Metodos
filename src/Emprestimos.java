public class Emprestimos {
    private String tipoEmprestimo;
    private double taxaDeJuros;
    private String dataEmprestimo;
    private String dataPagamento;

    // Construtor padrão
    public Emprestimos() {
    }

    // Construtor com parâmetros
    public Emprestimos(String tipoEmprestimo, double taxaDeJuros, String dataEmprestimo, String dataPagamento) {
        this.tipoEmprestimo = tipoEmprestimo;
        this.taxaDeJuros = taxaDeJuros;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPagamento = dataPagamento;
    }

    // Método para solicitar empréstimo
    public void solicitarEmprestimo() {
        System.out.println("Solicitando empréstimo do tipo: " + tipoEmprestimo);
    }

    // Método para calcular juros
    public void calcularJuros() {
        System.out.println("Calculando juros para a taxa: " + taxaDeJuros);
    }

    // Método para registrar pagamento
    public void registrarPagamento() {
        System.out.println("Registrando pagamento na data: " + dataPagamento);
    }

    // Getters e Setters
    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
