package revisaoIf;

import java.util.Scanner;

public class EscrevendoConsole {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Qual o seu email?");

		String email = Scanner.nextLine();

		char simbolo = '@';
		int contador = 0;

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == simbolo) {

				contador++;

			}

		}

		if (simbolo == simbolo) {

			if (contador == 1) {

				System.out.println("");
				System.out.println("Continuar");
			} else if (contador < 1) {

				System.out.println("email invalido");
			} else if (contador > 1) {
				System.out.println("");
				System.out.println("Utilize apenas 1 email para cadastro");

			}

		}

	}

}
