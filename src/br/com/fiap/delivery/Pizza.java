package br.com.fiap.delivery;

public class Pizza extends Produtos {

	private String sabor;

	public Pizza(String nomeProduto, double valor) {
		super(nomeProduto, valor);
	}

	public Pizza(String nomeProduto, double valor, String sabor) {
		super(nomeProduto, valor);
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
