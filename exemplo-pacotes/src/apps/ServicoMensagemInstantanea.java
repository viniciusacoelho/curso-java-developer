package apps;

// a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	
	/*// mecanismos reutilizaveis
	public void enviarMensagem() {
		// primeiro confirmar se está conectado à internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		// depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	// métodos privados, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico da mensagem");
	}*/
	
	public abstract void enviarMensagem(); // métodos abtratos não tem corpo,
	public abstract void receberMensagem(); // sendo encerradas por ;
	
	// mais um método que todos os filhos deverão implementar
	// public abstract void salvarHistoricoMensagem();
	
	// somente os filhos/classes do mesmo package conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}
