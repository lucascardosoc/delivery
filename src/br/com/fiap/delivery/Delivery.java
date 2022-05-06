package br.com.fiap.delivery;

public class Delivery {

	public static void main(String[] args) {

		Lanches lanches = new Lanches("+BACON", 16);
		Pizza pizza = new Pizza("Queijinho", 52, "Mussarela");
		Refeicoes refeicoes = new Refeicoes("Feijuca", 32, "Brasileira", 750);

		System.out.println(lanches.getNomeProduto() + " - R$" + lanches.getValor());

		System.out.println(pizza.getNomeProduto() + " - R$" + pizza.getValor() + ", sabor: " + pizza.getSabor());

		System.out.println(refeicoes.getNomeProduto() + " - R$" + refeicoes.getValor() + ", comida "
				+ refeicoes.getNacionalidade() + ", com " + refeicoes.getQtdeCalorias() + " kcal");
	}

}
