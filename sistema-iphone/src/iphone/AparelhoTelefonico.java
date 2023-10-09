package iphone;

public class AparelhoTelefonico {
    String ligacao;
    boolean atendeu;
    boolean atenderLigacao;
    String recebendoLigacao;
    String enviarMensagem;
    String receberMensagem;

    public void fazerLigacao(){
        ligacao = "Chamando...";
    }

    public void receberLigacao(){
        recebendoLigacao = "Fulano está te ligado...";
    }

     public void enviarMensagem(){
        enviarMensagem = "Enviamos sua mensagem!";
    }

     public void receberMensagem(){
        receberMensagem = "Você recebeu uma mensagem de Fulano!";
    }

    public void atendeu(){
        atendeu = true;
    }

    public void atenderLigacao(){
        atenderLigacao = true;
    }
}
