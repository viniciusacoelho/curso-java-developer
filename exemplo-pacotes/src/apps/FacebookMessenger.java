package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
// import pilaresDoPoo2.ServicoMensagemInstantanea;
	
	/*public void enviarMensagem() {
		validarConectadoInternet(); // encapsular: aglomerar algumas funcionalidades que só vai acontecer dentro da própria classe
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
	
	// métodos privados, visíveis somente na classe
	// public void validarConectadoInternet() {
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	// public void salvarHistoricoMensagem() {
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico da mensagem");
	}*/
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
}
