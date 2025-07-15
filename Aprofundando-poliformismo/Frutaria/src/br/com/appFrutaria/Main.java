package br.com.appFrutaria;

import br.com.appFrutaria.model.*;
import br.com.appFrutaria.service.*;
import br.com.appFrutaria.view.*;

public class Main {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Fruta fruta = new Fruta();
		Estoque estoque = new Estoque();
		Verdura verdura = new Verdura();

		int opcaoMenuEscolhida;
		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			if (opcaoMenuEscolhida == 1) {
				int opcaoCadastro = atendente.menuCadastro();
				estoque.gerenciarEstoque(opcaoCadastro, atendente);
			} else {
				estoque.gerenciarMenuPrincipal(opcaoMenuEscolhida, atendente, verdura, fruta, verdura);
			}
		} while (opcaoMenuEscolhida != 0);
	}
}