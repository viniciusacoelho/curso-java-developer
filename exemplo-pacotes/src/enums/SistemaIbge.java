package enums;

public class SistemaIbge {
	public static void main(String[] args) {
        // imprimindo os estados existentes no enum
		for (EstadoBrasileiro e: EstadoBrasileiro.values()) { // values() -> verifica quais são as opções que eu já coloquei no meu enum
			// System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
        // selecionando um estado a partir das opções disponíveis
		// EstadoBrasileiro eb = EstadoBrasileiro.PIAUI; // exibir um específico
		// EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO; // tem um objeto que representa o estado sp
		EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
		
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getIbge());
	}
}
