package pilaresDoPOO2;

import apps.MSNMessenger;
import apps.FacebookMessenger;
import apps.Telegram;
import apps.ServicoMensagemInstantanea;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		/*// abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		// msn.validarConectadoInternet();
		msn.enviarMensagem();
		// msn.salvarHistoricoMensagem();
		
		msn.receberMensagem();*/
		
		/*System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();		
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();		
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("TELEGRAM");
		Telegram tlg = new Telegram();		
		tlg.enviarMensagem();
		tlg.receberMensagem();*/
		
		ServicoMensagemInstantanea smi = null;
		/*
			NÃO SABE QUAL APP
			MAS QUALQUER UM DEVERÁ ENVIRAR E RECEBER MENSAGEM
		*/
		// String appEscolhido = "msn";
		String appEscolhido = "tlg";
		
		if (appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		} else if (appEscolhido.equals("fbm")) {
			smi = new FacebookMessenger();			
		} else if (appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		// smi.validarConectadoInternet();
	}
}
