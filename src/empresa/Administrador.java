package empresa;

public class Administrador extends Empregado {
	private Double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, Double ajudaDeCusto, Double salario) {
		super(nome, endereco, telefone, salario);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public Double calcularSalario() {
		return getSalario() + ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "Administrador [ajudaDeCusto=" + ajudaDeCusto + "]";
	}
	
}