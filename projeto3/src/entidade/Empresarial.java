package entidade;

public abstract class Empresarial extends Contribuinte {
	private Integer numroDeEmpregados;
	
	public Empresarial() {
		super();
	}

	public Empresarial(String nome, Double rendimentoAnual, Integer numroDeEmpregados) {
		super(nome, rendimentoAnual);
		this.numroDeEmpregados = numroDeEmpregados;
	}

	public Integer getNumroDeEmpregados() {
		return numroDeEmpregados;
	}

	public void setNumroDeEmpregados(Integer numroDeEmpregados) {
		this.numroDeEmpregados = numroDeEmpregados;
	}
	
}
