package br.com.appFrutaria.service;

import br.com.appFrutaria.model.*;
import br.com.appFrutaria.view.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<Fruta> estoque;

	public Estoque() {
		estoque = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcaoMenuEscolhida, Atendente atendente, Fruta fruta) {
		switch (opcaoMenuEscolhida) {
		case 1:
			String nome = atendente.cadastrarNome();
			double preco = atendente.cadastrarPreco();
			int quantidade = atendente.cadastrarQuantidade();
			String origem = atendente.cadastrarOrigem();
			fruta = new Fruta(nome, preco, quantidade, origem);
			estoque.add(fruta);
			System.out.println("Fruta cadastrada com sucesso!");
			break;
		case 2:
			atendente.listar(estoque);
			break;
		case 3:
			atendente.removerFruta(estoque);
			break;
		case 4:
			atendente.pesquisarPorNome(estoque);
			break;
		case 5:
			atendente.editarFruta(estoque);
			break;
		case 6:
			System.out.println("Total de frutas cadastradas: " + estoque.size());
			break;
		case 0:
			System.out.println("Sistema de Frutaria - Encerrando...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}

	public List<Fruta> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Fruta> estoque) {
		this.estoque = estoque;
	}
}