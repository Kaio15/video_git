package revisaoIf;

public class AlugueAgora {

	public static void main(String[] args) {

		String euSou = "Fornecedor";
		int opcao = 1;

		if (euSou.equalsIgnoreCase("Proprietário")) {
			System.out.println("Escolheu a opção " + euSou);
		} else if (euSou.equalsIgnoreCase("Corretor")) {
			System.out.println("Escolheu a opção " + euSou);
		} else if (euSou.equalsIgnoreCase("Imobiliária")) {
			System.out.println("Escolheu a opção " + euSou);
		} else if (euSou.equalsIgnoreCase("Fornecedor")) {
			System.out.println("Escolheu a opção " + euSou);
		} else {
			System.out.println("Opção invalida digite Proprietário|Corretor|Imobiliária|Fornecedor");
		}
 
	}

}
