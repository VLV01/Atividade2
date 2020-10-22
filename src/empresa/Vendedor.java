package empresa;

public class Vendedor extends Empregado{
	
	private Double valorVendas;
	private Double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, Double valorVendas, Double comissao, Double salario) {
		super(nome, endereco, telefone, salario);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public Double calcularSalario() {
		return getSalario() + comissao;
		
	}

	@Override
	public String toString() {
		return "Vendedor [valorVendas=" + valorVendas + ", comissao=" + comissao + "]";
	}
	
	
	

}
