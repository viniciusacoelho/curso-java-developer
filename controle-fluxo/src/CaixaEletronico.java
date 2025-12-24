public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitato = 17.0;
        // double valorSolicitato = 26.0;
        // double valorSolicitato = 22.0;

        if (valorSolicitato < saldo) {
            saldo = saldo - valorSolicitato;    
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
        

    }
    
}
