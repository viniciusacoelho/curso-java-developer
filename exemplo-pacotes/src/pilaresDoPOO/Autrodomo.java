package pilaresDoPOO;

// A POO é baseada em estruturação de objetos com carcterísticas  e comportamentos

public class Autrodomo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		// jeep.confereCambio();
		// jeep.confereCombustivel();
		jeep.setChassi("897897");
		jeep.setChassi("8769756");
		// jeep.ligar(); // só precisa desse
		
		Moto z400 = new Moto();
		z400.setChassi("467754");
		// z400.ligar();
		
		// Veiculo coringa = jeep;
		Veiculo coringa = z400;
		
		coringa.ligar();
	}
}
