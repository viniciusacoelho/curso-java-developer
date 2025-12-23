import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para nosso usuário
        System.out.println("Digite o número da conta/agência: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o nome da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados  no terminal
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                           ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        // Exibir a mensagem conta criada
        System.out.println("Conta criada com sucesso!");
    }
}
