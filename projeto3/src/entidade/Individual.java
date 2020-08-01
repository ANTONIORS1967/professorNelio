package entidade;

public  abstract class Individual extends Contribuinte {
	private Double gastoComSaude;
	
	public Individual() {
		super();
	}

	public Individual(String nome, Double rendimentoAnual, Double gastoComSaude) {
		super(nome, rendimentoAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}
	
	
}
