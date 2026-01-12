package pilaresDoPOO;

public abstract class Veiculo { // classe genérica
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public abstract void ligar(); // uma única finalidade com comportamentos diferentes para a mesma finalidade
}
