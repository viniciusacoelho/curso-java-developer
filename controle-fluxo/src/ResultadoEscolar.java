public class ResultadoEscolar {
    public static void main(String[] args) {
/*
        int nota = 6;
        // int nota = 8;
        // int nota = 10;

        if (nota >= 7) { // true
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) { // true ou false
            System.out.println("Prova Recuperação");
        } else { // false
            System.out.println("Reprovado");
        }
        int nota = 7;
        // int nota = 5;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
*/
        int nota = 6;
        // int nota = 3;
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
