package br.com.appFrutaria.view;

import br.com.appFrutaria.model.*;
import java.util.List;
import java.util.Scanner;

public class Atendente {

	static Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		int opcaoMenu;

		System.out.println("-------- Frutaria --------");
		System.out.println("");
		System.out.println("1 - Cadastrar fruta");
		System.out.println("2 - Listar frutas");
		System.out.println("3 - Remover fruta");
		System.out.println("4 - Pesquisar por nome");
		System.out.println("5 - Editar fruta");
		System.out.println("6 - Contagem de frutas");
		System.out.println("0 - Sair");
		System.out.println("");
		System.out.print("-------> ");

		opcaoMenu = input.nextInt();
		input.nextLine();
		if (opcaoMenu < 0 || opcaoMenu > 6) {
			System.out.println("Código inválido");
		}

		return opcaoMenu;
	}

	public String cadastrarNome() {
		System.out.println("Digite o nome da fruta:");
		String nome = input.nextLine();
		return nome;
	}

	public double cadastrarPreco() {
		System.out.println("Digite o preço:");
		double preco = input.nextDouble();
		input.nextLine();
		return preco;
	}

	public int cadastrarQuantidade() {
		System.out.println("Digite a quantidade:");
		int quantidade = input.nextInt();
		input.nextLine();
		return quantidade;
	}

	public String cadastrarOrigem() {
		System.out.println("Digite a origem:");
		String origem = input.nextLine();
		return origem;
	}

	public void listar(List<Fruta> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhuma fruta cadastrada.");
			return;
		}
		System.out.println("=== LISTA DE FRUTAS ===");
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println((i + 1) + " - " + estoque.get(i).toString());
		}
	}

	public void removerFruta(List<Fruta> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("O estoque está vazio.");
			return;
		}

		System.out.println("Frutas disponíveis:");
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println((i + 1) + " - " + estoque.get(i).getNome());
		}

		System.out.println("Digite o número da fruta que deseja remover:");
		System.out.print("> ");
		int escolha = input.nextInt();
		input.nextLine();

		if (escolha > 0 && escolha <= estoque.size()) {
			Fruta removida = estoque.remove(escolha - 1);
			System.out.println("Fruta '" + removida.getNome() + "' removida com sucesso!");
		} else {
			System.out.println("Opção inválida.");
		}
	}

	public void pesquisarPorNome(List<Fruta> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("O estoque está vazio.");
			return;
		}

		System.out.println("Digite o nome da fruta para pesquisar:");
		String nomeBusca = input.nextLine();

		boolean encontrou = false;
		for (Fruta fruta : estoque) {
			if (fruta.getNome().toLowerCase().contains(nomeBusca.toLowerCase())) {
				System.out.println("Encontrado: " + fruta.toString());
				encontrou = true;
			}
		}

		if (!encontrou) {
			System.out.println("Nenhuma fruta encontrada com esse nome.");
		}
	}

	public void editarFruta(List<Fruta> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("O estoque está vazio.");
			return;
		}

		System.out.println("Frutas disponíveis:");
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println((i + 1) + " - " + estoque.get(i).getNome());
		}

		System.out.println("Digite o número da fruta que deseja editar:");
		System.out.print("> ");
		int escolha = input.nextInt();
		input.nextLine();

		if (escolha > 0 && escolha <= estoque.size()) {
			Fruta fruta = estoque.get(escolha - 1);
			System.out.println("Editando: " + fruta.getNome());

			System.out.println("Novo nome (ou Enter para manter):");
			String novoNome = input.nextLine();
			if (!novoNome.isEmpty()) {
				fruta.setNome(novoNome);
			}

			System.out.println("Novo preço (ou 0 para manter):");
			double novoPreco = input.nextDouble();
			if (novoPreco > 0) {
				fruta.setPreco(novoPreco);
			}
			input.nextLine();

			System.out.println("Nova quantidade (ou 0 para manter):");
			int novaQuantidade = input.nextInt();
			if (novaQuantidade > 0) {
				fruta.setQuantidade(novaQuantidade);
			}
			input.nextLine();

			System.out.println("Nova origem (ou Enter para manter):");
			String novaOrigem = input.nextLine();
			if (!novaOrigem.isEmpty()) {
				fruta.setOrigem(novaOrigem);
			}

			System.out.println("Fruta editada com sucesso!");
		} else {
			System.out.println("Opção inválida.");
		}
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}
} 