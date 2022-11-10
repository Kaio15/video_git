package revisaoIf;

public class RevisandoIf {

	public static void main(String[] args) {

		int valor = 1000;
		int saldoCliente = 3000;
		int quantidadeEstoque = 10;
		int quantidadeSolicitado = 1;

		int valorTotal = valor * quantidadeSolicitado;
		if (saldoCliente >= valorTotal && quantidadeEstoque >= quantidadeSolicitado) {
			quantidadeEstoque = quantidadeEstoque - quantidadeSolicitado;
			saldoCliente = saldoCliente - valorTotal;
			System.out.println("Compra Realizada!");

		} else {
			System.out.println("Compra nao aprovada");

		}
		System.out.println("Saldo atualizado R$" + saldoCliente);
System.out.println("Estoque atual: " + quantidadeEstoque);


//teste
	}

}
