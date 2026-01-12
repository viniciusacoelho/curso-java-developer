public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        // ContaCorrente cc = new ContaCorrente();
        // ContaPoupanca poupanca = new ContaPoupanca();
        // IConta cc = new ContaCorrente();
        // IConta poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        /*ContaCorrente corrente = new ContaCorrente();
        corrente.setSaldo(1000.00);
        corrente.deposito(300);
        corrente.saque(300);
        System.out.println(corrente.getSaldo());

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setSaldo(2000.00);
        poupanca.deposito(400);
        poupanca.saque(700);
        System.out.println(poupanca.getSaldo());

        corrente.transferencia(poupanca,100);
        System.out.println(poupanca.getSaldo());*/
    }
}
