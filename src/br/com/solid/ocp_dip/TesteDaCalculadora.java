package br.com.solid.ocp_dip;

public class TesteDaCalculadora {

	public static void main(String[] args) {
		TabelaDePreco tabela = new TabelaDePrecoAleatoria();
		ServicoDeEntrega correios = new Frete();
		CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(tabela, correios);
		
		Produto produto = new Produto( 6000.00,"SAO PAULO");
		
		System.out.println(calculadoraDePrecos.calcula(produto));
	}

}
