package revisaoIf;

public class AbrirConta {

	public static void main(String[] args) {

		String tipoConta = "pj";

		switch (tipoConta) {
		case "pf":
			System.out.println("abertura de conta " + tipoConta);
			break;
		case "pj":
			System.out.println("Abertura de contaà " + tipoConta);
			break;
		default:
			System.out.println("permitido somente pf ou pj");
		}

	}

}
