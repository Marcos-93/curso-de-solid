package br.com.solid.ocp_dip;

public class CalculadoraDePrecos {
	
	
	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;
	//Aberta para extensão, porém, fechada para modificação OCP
	//Inversão de dependência DIP - recebendo a classe mais abstrata possível fica fácil alterar entre as implementações
	//Sempre em busca da maior estabilidade!
	public CalculadoraDePrecos(TabelaDePreco tabela,ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Produto produto) {
		
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());
		
		return produto.getValor()*(1-desconto) + frete;
	}
}
