package edu.vinicius.segundasemana;

public class MinhaClasse {
    
    public static void main (String [] agrs) {
/*
        System.out.print ("Olá turma, sejam bem-vindos");
        
        int ano = 2021;

        ano = 2022;
        
        final String BR = "Brasil"; // não pode ser alterado
        
        // BR = "Brazil";

        double PI = 3.14;
        int ESTADOS_BRASILEIRO = 27;
        int ANO_2000 = 2000;
        
        int $numero = 1;

        String meuNome = "Gleyson";
        meuNome = "Vinícius";

        int anoFabricacao = 2022;

        boolean simNao; // valores lógicos
        boolean verdadeira = true;
        verdadeira = false;

        anoFabricacao = 2018;

*/
        String primeiroNome = "Gleyson";
        primeiroNome = "Vinícius";
        String segundoNome = "Sampaio";
        segundoNome = "Araújo Coêlho";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) { // método
        return "Resultado do método " +  primeiroNome.concat(" ").concat(segundoNome); // power class, concatena com espaço e com o segundo nome
    }

}
