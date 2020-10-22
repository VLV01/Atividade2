package empresa;

public class Empregado extends Pessoa {
	
	private Double salario;
	
	public Empregado(String nome, String endereco, String telefone, Double salario) {
		super(nome, endereco, telefone);
		this.salario = salario;
		
	}

	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	

}
