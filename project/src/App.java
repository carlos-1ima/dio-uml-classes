public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone("2024");

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Java Music");

        meuIphone.ligar("111-222-333");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.url.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
