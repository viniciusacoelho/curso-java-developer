package construtores;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
	public Pessoa (String cpf, String nome) { // não colocar todos os atributos, apenas o essencial
		this.cpf = cpf; // vai setar ou definir o cpf da classe pessoa (this)
		this.nome = nome; // um atributo é da classe diferentemente do parâmetro (this)
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public Pessoa() { // 2 construtores, um padrão e o outro apenas com os atributos essenciais
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}

	// public void setEndereco(String endereco) {
	//    this.endereco = endereco;
	// }
	
	public void setEndereco(String newEndereco) {
		this.endereco = newEndereco;
	}
	
	
	// ...
	// setters de nome e cpf?
}
