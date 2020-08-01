package entidade;

public class ContoPoupanca extends Conta {
	
	private Double taxaDeJuros;
	
	public ContoPoupanca() {
		super();
	}

	public ContoPoupanca(Integer numero, String suporte, Double saldo, Double taxaDeJuros) {
		super(numero, suporte, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void utilizarSaldo() {
		saldo += saldo*taxaDeJuros;
	}
	
}
