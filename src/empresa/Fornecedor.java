package empresa;

public class Fornecedor extends Pessoa {
	
	private Double valorCredito;
	private Double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida )  {
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	
	public Double getValorCredito() {
		return valorCredito;
	}


	public Double getValorDivida() {
		return valorDivida;
	}


	public Double obterSaldo() {
		return valorCredito - valorDivida;
	}


	@Override
	public String toString() {
		return "Fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + "]";
	}
	
	
	

}
