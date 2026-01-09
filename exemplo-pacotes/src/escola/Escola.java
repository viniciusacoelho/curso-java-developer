package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		// felipe.nome = "Felipe";
		// felipe.idade = 8;
		// felipe.setNome("Felipe Junior");
		// felipe.setIdade(12);
		felipe.setNome("Felipe José");
		felipe.setIdade(17);
		
		// System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
		// RESULTADO NO CONSOLE
		// O aluno Felipe tem 8 anos
	}
}