package br.com.appFrutaria.service;

import br.com.appFrutaria.model.*;
import br.com.appFrutaria.view.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<Produto> estoque;

	public Estoque() {
		estoque = new ArrayList<>();
	}

	public void gerenciarMenuPrincipal(int opcaoMenuEscolhida, Atendente atendente, Produto produto, Fruta fruta,
			Verdura verdura) {
		switch (opcaoMenuEscolhida) {
		case 1:
			atendente.menuCadastro();
			break;
		case 2:
			atendente.listar(estoque);
			break;
		case 0:
			atendente.encerrrando();
			break;

		}
	}

	public void gerenciarEstoque(int opcaoMenuCadastro, Atendente atendente) {
		switch (opcaoMenuCadastro) {
		case 1:
			String nome = atendente.cadastrarNomeFruta();
			double preco = atendente.cadastrarPrecoFruta();
			int quantidade = atendente.cadastrarQuantidadeFruta();
			String origem = atendente.cadastrarOrigem();
			Fruta novaFruta = new Fruta(nome, preco, quantidade, origem);
			estoque.add(novaFruta);
			System.out.println("Fruta cadastrada com sucesso!");
			break;
		case 2:
			nome = atendente.cadastrarNomeVerdura();
			preco = atendente.cadastrarPrecoVerdura();
			quantidade = atendente.cadastrarQuantidadeVerdura();
			String tipo = atendente.cadastrarTipo();
			Verdura novaVerdura = new Verdura(nome, preco, quantidade, tipo);
			estoque.add(novaVerdura);
			System.out.println("Verdura cadastrada com sucesso!");
			break;
		case 0:
			atendente.encerrrando();
			break;
		}
	}

	public List<Produto> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Produto> estoque) {
		this.estoque = estoque;
	}
}