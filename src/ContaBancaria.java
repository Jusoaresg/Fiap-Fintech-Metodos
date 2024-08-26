public class ContaBancaria {

	private String numeroConta;
	private Cliente titular;
	private double saldo;

	// construtor com parametros
	public ContaBancaria(String numeroConta, Cliente titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	// metodo para depositar dinheiro
	public void depositar(Double valor) {
		this.saldo += valor;
		System.out.println("Depositando" + valor + "na conta de " + titular.getNome());
	}

	// metodo pegar saldo
	public double getSaldo(){
		return this.saldo;
	}

	// metodo setar saldo
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	// metodo para sacar dinheiro
	public void sacar(Double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Sacando " + valor + " da conta de " + titular.getNome());
			return;
		}
		System.out.println("Saldo insuficiente!");
	}
}
