public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Vampiro");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("+55 (82) 9 9827-1900");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();
        navegadorNaInternet.exibirPagina("https://github.com/viniciusacoelho");
        navegadorNaInternet.exibirPagina("https://www.linkedin.com/in/viniciusacoelho/");
        navegadorNaInternet.adicionarNovaAba();
        navegadorNaInternet.atualizarPagina();
    }
}
