package br.com.appFrutaria.model;

public class Produto {

	protected String nome;
	protected double preco;
	protected int quantidade;

	public Produto() {
		this.setNome("");
		this.setPreco(0.0);
		this.setQuantidade(0);
	}

	public Produto(String nome, double preco, int quantidade, String tipo) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade;
	}

}
