public class ContaService {
    Conta conta;

    public boolean validarSaque(double valorSaque) {
        return valorSaque >= conta.getSaldo();
    }

    public boolean validarTransferencia(double valor) {
        return valor > 0;
    }
}
