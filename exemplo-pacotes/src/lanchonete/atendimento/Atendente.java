package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		// ..?
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO LANCHE NA COZINHA");
	}
	
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	
	// public void trocarGas() {
	void trocarGas() { // default
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
}
