package br.com.solid.ocp_dip;

public class Produto {
	private final double valor;
	private final String cidade;
	
	public Produto(double valor,String cidade){
		this.valor = valor;
		this.cidade = cidade;
	}
	public double getValor() {
		return this.valor;
	}

	public String getCidade() {
		return this.cidade;
	}

}
