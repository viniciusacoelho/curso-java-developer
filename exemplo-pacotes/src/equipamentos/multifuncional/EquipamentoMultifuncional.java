package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

// public class EquipamentoMultifuncional extends Impressora, Copiadora { // não funciona
// public class EquipamentoMultifuncional extends Impressora extends Copiadora { // não funciona
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override // É para dizer que está havendo uma sobreescrita do método que eu estou herdando de algum lugar esse métdo para a minha implementação
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTFUNCIONAL");
	}

	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTFUNCIONAL");
	}

	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTFUNCIONAL");	
	}
	
}
