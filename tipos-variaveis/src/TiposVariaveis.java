public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos
        // estudem a classe String que representa texto na aplicação

        String meuNome = "GLEYSON SAMPAIO";
        meuNome = "VINÍCIUS ARAÚJO COÊLHO";
        
        byte numero1;
        short numero2;
        int numero3;
        long numero4;

        double salarioMinimo = 2500;
        salarioMinimo = 2500.33;
        salarioMinimo = 2.500; // não é 2.500, é 2,500

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; erro
        short numeroCurto2 = (short) numeroNormal; // valido! casting

        int numero = 5;
        
        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; // não pode mudar
        
        // VALOR_DE_PI = 10.75;
    }
}
