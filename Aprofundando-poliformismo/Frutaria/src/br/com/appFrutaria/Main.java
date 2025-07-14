package br.com.appFrutaria;

import  br.com.appFrutaria.model.*;
import  br.com.appFrutaria.service.*;
import  br.com.appFrutaria.view.*;

public class Main {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Fruta fruta = new Fruta();
		Estoque estoque = new Estoque();

		int opcaoMenuEscolhida;
		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente, fruta);
		} while (opcaoMenuEscolhida != 0);

	}
} 