

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    private String modelo;

    Iphone(String modelo) {
        this.modelo = modelo;
    }

    public void tocar() {
        System.out.println("Tocando música no Iphone " + modelo);
    }

    public void pausar() {
        System.out.println("Pausando música no Iphone " + modelo);
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no Iphone " + modelo);
    }

    public void ligar(String numero) {
        System.out.println("Realizando chamada para o número " + numero + " no Iphone " + modelo);
    }

    public void atender() {
        System.out.println("Atendendo chamada no Iphone " + modelo);
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone " + modelo);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página do navegador com a URL: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba do navegador no Iphone " + modelo);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página do navegador no Iphone " + modelo);
    }
}
