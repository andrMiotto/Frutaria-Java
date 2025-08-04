package br.com.appFrutaria.model;

public class Fruta extends Produto {

	private String origem;

	public Fruta() {
		super();
		this.origem = "";
	}

	public Fruta(String nome, double preco, int quantidade, String origem) {
		super(nome, preco, quantidade, origem);

		this.origem = origem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

}