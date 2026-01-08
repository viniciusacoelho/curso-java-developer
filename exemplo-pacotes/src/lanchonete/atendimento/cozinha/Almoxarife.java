package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAÍDA DOS ITENS");
	}
	
	// public void entregarIngredientes() {
	void entregarIngredientes() { // default
		System.out.println("ENTREGANDO INGREDIENTES");
		// ...?
		controlarSaida();
	}
	
	// public void trocarGas() {
	void trocarGas() { // default
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
