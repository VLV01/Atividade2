package principal;

import empresa.Administrador;
import empresa.Fornecedor;
import empresa.Vendedor;

public class Teste {
	public static void main(String[] args) {
		
		
		Fornecedor f = new Fornecedor("Claudio Nascimento", "Rua 0" , "(00) 9 0000-0000", 1000.00, 950.00);
		System.out.println("Fornecedor: Nome: " + f.getNome() + 
				" Endereço : " + f.getEndereco() +
				" Telefone : " + f.getTelefone() +
				" Crédito : " + f.getValorCredito() +
				" Dívida: " + f.getValorDivida() +
				" Balanço : "+ f.obterSaldo());
		
	
		Administrador a = new Administrador("Péricles Nascimento", "Rua 1" , "(11) 9 1111-1111", 600.00, 1200.00);
		System.out.println("Administrador: Nome: " + a.getNome() + 
				" Endereço : " + a.getEndereco() +
				" Telefone : " + a.getTelefone() +
				" Ajuda de Custo : " + a.getAjudaDeCusto() +
				" Salário : " + a.calcularSalario());
	
		
		
		Vendedor v = new Vendedor("Eymael Nascimento", "Rua 2" , "(22) 9 2222-2222", 10000.00, 25.00, 4200.00);
		System.out.println("Vendedor: Nome: " + v.getNome() + 
				" Endereço: " + v.getEndereco() +
				"Telefone: " + v.getTelefone() +
				" Valor vendido: " + v.getValorVendas() +
				" Comissão (em %): " + v.getComissao() +
				" Salário: " + v.calcularSalario());
	
	}
	
	
	

}
