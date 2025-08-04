package br.com.appFrutaria.view;

import java.util.Scanner;
import java.util.InputMismatchException;

public class VerifyType {

	public static int lerInteiroValido(String mensagemErro) {
		Scanner input = new Scanner(System.in);
		boolean entradaValida = false;
		int opcaoValidacaoDigitada = 0;

		while (!entradaValida) {
			try {
				System.out.print("-------> ");
				opcaoValidacaoDigitada = input.nextInt();
				entradaValida = true;
			} catch (InputMismatchException erro) {
				System.out.println(mensagemErro);
				input.nextLine();
			}
		}

		return opcaoValidacaoDigitada;
	}
	
	public static double lerDoubleValido(String mensagemErro) {
		Scanner input = new Scanner(System.in);
		boolean entradaValida = false;
		double opcaoValidacaoDigitada = 0;

		while (!entradaValida) {
			try {
				System.out.print("-------> ");
				opcaoValidacaoDigitada = input.nextDouble();
				entradaValida = true;
			} catch (InputMismatchException erro) {
				System.out.println(mensagemErro);
				input.nextLine();
			}
		}

		return opcaoValidacaoDigitada;
	}
	
	
	
	

}
