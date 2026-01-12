package estabelecimento;

import java.util.Scanner;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
// import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		// Impressora impressora = new Deskjet();
		// Impressora impressora = new Laserjet();
		/*Impressora impressora = new EquipamentoMultifuncional();
		
		impressora.imprimir();*/
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
				
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		// Deskjet deskjet = new Deskjet();
		
		// Impressora impressora = deskjet; // funciona
		// Digitalizadora digitalizadora = deskjet; // não funciona
		// Copiadora copiadora = deskjet; // não funciona
		
		// Scanner scanner = new Scanner();
		
		// Impressora impressora = scanner; // não funciona
		// Digitalizadora digitalizadora = scanner; // funciona
		// Copiadora copiadora = scanner; // não funciona
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
