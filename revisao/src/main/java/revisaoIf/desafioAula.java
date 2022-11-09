package revisaoIf;

import java.util.Scanner;

public class desafioAula {

	public static void main(String[] args) {

		
		String email = "teste@teste.com";
		String senha = "123";
		int identificacao = 1; // 1- CRIAR CONTA | 2- JA SOU CLIENTE

		switch (identificacao) {

		case 1:
			System.out.println("E-mail " + email);
			System.out.println("Continuar");
			break;
		case 2:
			System.out.println("E-mail " + email);
			System.out.println("Senha " + senha);
			System.out.println("Continuar");
			break;
		default:
			System.out.println("RECUPERAR SENHA");

		}

	}
}
