import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do { // executa pelo menos 1 vez
            // executado repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while(tocando());

        System.out.println("Alô!!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1; // se o valor for entre 1 e 3 é porque atendeu
        System.out.println("Atendeu? " + atendeu);
        // negando ato de continuar tocando
        return !atendeu; // se atendeu, não quero que fique tocando
    }    
}
