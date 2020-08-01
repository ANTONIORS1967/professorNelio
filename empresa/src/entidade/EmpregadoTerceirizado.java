package entidade;

public class EmpregadoTerceirizado extends Empregado{
	private Double cobrancaAdicional;
	
	
	public  EmpregadoTerceirizado() {
		
	}


	public EmpregadoTerceirizado(String nome, Integer hora, Double valorPorhora, Double cobrancaAdicional) {
		super();
		this.cobrancaAdicional = cobrancaAdicional;
	}


	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}


	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public double FormaDePagamento() {
		return super.FormaDePagamento() + cobrancaAdicional * 1.1;
	}
}
