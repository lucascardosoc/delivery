package br.com.fiap.delivery;

public class Refeicoes extends Produtos {

	private String nacionalidade;
	private double qtdeCalorias;

	public Refeicoes(String nomeProduto, double valor) {
		super(nomeProduto, valor);
	}

	public Refeicoes(String nomeProduto, double valor, String nacionalidade, double qtdeCalorias) {
		super(nomeProduto, valor);
		this.nacionalidade = nacionalidade;
		this.qtdeCalorias = qtdeCalorias;
	}

	@Override
	public double getValor() {
		return super.getValor() * 0.95;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getQtdeCalorias() {
		return qtdeCalorias;
	}

	public void setQtdeCalorias(double qtdeCalorias) {
		this.qtdeCalorias = qtdeCalorias;
	}

}
