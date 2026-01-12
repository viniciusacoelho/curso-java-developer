package pilaresDoPOO;

public class Carro extends Veiculo { // classe especializada
	/*private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}*/
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	
	// public void confereCombustivel() { // precisa encapsular
	private void confereCombustivel() { // encapsulado
		System.out.println("conferindo combustivel");
	}
		
	// public void confereCambio() {
	private void confereCambio() {
		System.out.println("conferindo cambio em P");
	}
}
