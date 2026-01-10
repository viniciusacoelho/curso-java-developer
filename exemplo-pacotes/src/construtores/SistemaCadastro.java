package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		// criamos uma pessoa no sistema
		// Pessoa marcos = new Pessoa();
		Pessoa marcos = new Pessoa("123", "Marcos"); // informações obrigatórias
		
		// definimos o endereço de Marcos
		marcos.setEndereco("RUA DAS MARIAS"); // pode ser atribuido em um 2º momento
		
		// e como definir o nome e o cpf do Marcos?
		
		// imprimindo o Marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}
}
