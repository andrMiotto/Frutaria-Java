package br.com.appFrutaria.view;

import br.com.appFrutaria.view.VerifyType;
import br.com.appFrutaria.model.*;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Atendente {
	static Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		int opcaoMenu = 0;
		System.out.println("-------- Frutaria --------");
		System.out.println("");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2- Listar produtos");
		System.out.println("0 - Sair");
		System.out.println("");

		boolean entradaValida = false;

		while (!entradaValida) {
			try {
				opcaoMenu = VerifyType.lerInteiroValido("❌ Erro: você não digitou um número válido. Digite novamente:");
				System.out.println("Você digitou o número: " + opcaoMenu);
				entradaValida = true;
			} catch (InputMismatchException erro) {
				System.out.println("❌ Erro: você não digitou um número válido.");
				opcaoMenu = input.nextInt();
				System.out.println("Digite novamente: ");
			}
		}

		return opcaoMenu;
	}

	public int menuCadastro() {
		int opcaoMenuCadastro = 0;
		System.out.println("-------- Frutaria --------");
		System.out.println("");
		System.out.println("1 - Cadastrar fruta");
		System.out.println("2- Cadastrar verdura");
		System.out.println("0 - Sair");
		System.out.println("");
		opcaoMenuCadastro = VerifyType.lerInteiroValido("❌ Erro: você não digitou um número válido. Digite novamente:");
		input.nextLine();
		if (opcaoMenuCadastro < 0 || opcaoMenuCadastro > 6) {
			System.out.println("Código inválido");
		}
		return opcaoMenuCadastro;
	}

	public void encerrrando() {
		System.out.println("Sistema de Frutaria - Encerrando...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

	public String cadastrarNomeFruta() {
		System.out.println("Digite o nome da fruta:");
		String nome = input.nextLine();
		return nome;
	}

	public String cadastrarNomeVerdura() {
		System.out.println("Digite o nome da verdura:");
		String nome = input.nextLine();
		return nome;
	}

	public double cadastrarPrecoFruta() {
		System.out.println("Digite o preço:");
		double preco = VerifyType.lerDoubleValido("❌ Erro: você não digitou um número válido. Digite novamente:");
		input.nextLine();
		return preco;
	}

	public double cadastrarPrecoVerdura() {
		System.out.println("Digite o preço:");
		double preco = VerifyType.lerDoubleValido("❌ Erro: você não digitou um número válido. Digite novamente:");
		input.nextLine();
		return preco;
	}

	public int cadastrarQuantidadeFruta() {
		System.out.println("Digite a quantidade");
		int quantidade = VerifyType.lerInteiroValido("❌ Erro: você não digitou um número válido. Digite novamente:");
		input.nextLine();
		return quantidade;
	}

	public int cadastrarQuantidadeVerdura() {
		System.out.println("Digite a quantidade:");
		int quantidade =VerifyType.lerInteiroValido("❌ Erro: você não digitou um número válido. Digite novamente:");
		input.nextLine();
		return quantidade;
	}

	public String cadastrarOrigem() {
		System.out.println("Digite a origem:");
		String origem = input.nextLine();
		return origem;
	}

	public String cadastrarTipo() {
		System.out.println("Digite o tipo:");
		String tipo = input.nextLine();
		return tipo;
	}

	public void listar(List<Produto> estoque) {
		if (estoque.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}
		System.out.println("=== LISTA DE PRODUTOS ===");
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println((i + 1) + " - " + estoque.get(i).toString());
		}
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}
}
