package entidade;

public class Empregado {

	private String nome;
	private Integer hora;
	private Double valorPorhora;
	
	public Empregado() {
		
	}

	public Empregado(String nome, Double valorPorhora, Integer hora) {
		this.nome = nome;
		this.hora = hora;
		this.valorPorhora = valorPorhora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorPorhora() {
		return valorPorhora;
	}

	public void  setValorPorhora(Double valorPorhora) {
		this.valorPorhora = valorPorhora;
	}
	
	public  double FormaDePagamento() {
		return hora*valorPorhora;
	}
}
