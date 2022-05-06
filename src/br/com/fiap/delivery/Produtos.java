package br.com.fiap.delivery;

public class Produtos {

	private String nomeProduto;
	private double valor;

	public Produtos(String nomeProduto, double valor) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getValor() {
		return valor;
	}

}
