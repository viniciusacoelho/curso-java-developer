public class Operadores {
    public static void main(String[] args) {
/*
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        int numero = 5;
        
        System.out.println(- numero);
        
        System.out.println(numero);
        
        numero = - numero;
        
        System.out.println(numero);
        
        numero = + numero; // não fica positivo
        numero = numero * -1;
        
        System.out.println(numero);
        
        int numero = 5;
        
        // x repetição
        // numero = numero + 2;
        // numero = numero + 1; // pode abreviar
        numero++;
        
        System.out.println( numero ++ ); // não adiciona
        System.out.println( ++ numero ); // adiciona
        System.out.println( numero -- );
        
        System.out.println(numero);
        boolean variavel = true;
        
        System.out.println(!variavel);
        
        System.out.println(variavel);
        
        variavel = !variavel;
        
        System.out.println(variavel);
        
        int a, b;
        
        a = 5;
        b = 6;
        /*
        String resultado = "";
        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
    }
    
    System.out.println(resultado);
   
   // String resultado = a == b ? "verdadeiro" : "falso"; // ver se retornaria um true ou false, expressão booleana
   int resultado = a == b ? 1 : 0;
   
   System.out.println(resultado);
   
   String nomeUm = "GLEYSON";
   // String nomeDois = "GLEYSON";
   String nomeDois = new String("GLEYSON");
   
   System.out.println(nomeUm == nomeDois);
   System.out.println(nomeUm.equals(nomeDois)); // compara se o conteúdo se dois objetos são iguais
   
   int numero1 = 1;
   int numero2 = 2;
   
   boolean simNao = numero1 == numero2;
   
   // if (numero1 < numero2) {
    if (numero1 == numero2) { // true
    System.out.println("a nossa condição é verdadeira");
}

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente de numeroDois? " + simNao);
    
    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois? " + simNao);
*/

    boolean condicao1 = true;
    boolean condicao2 = false;

    // if (condicao1 && condicao2) {
    if (condicao1 && ( 7 > 4 )) {
        System.out.println("as duas condições são verdadeiras");
    }
    
    if (condicao1 || condicao2) {
        System.out.println("Uma das duas condições é verdadeira");
    }
    
    System.out.println("fim");
}

}
