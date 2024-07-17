package Aplicação;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("iPhone está tocando música.");
        // Implementação específica para tocar música no iPhone
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("iPhone está ligando para " + numero);
        // Implementação específica para fazer uma ligação no iPhone
    }

    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("iPhone está abrindo a página web: " + url);
        // Implementação específica para abrir uma página web no iPhone
    }

    // Métodos específicos do iPhone que não estão nas interfaces
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("iPhone enviou mensagem para " + numero + ": " + mensagem);
        // Implementação específica para enviar mensagem no iPhone
    }
}
