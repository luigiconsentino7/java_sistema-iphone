package iphone;

public class Iphone{
    public static void main(String[] args) {

       ReprodutoMusical reprodutoMusical = new ReprodutoMusical();
       AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
       NavegadorInternet navegadorInternet = new NavegadorInternet();

       reprodutoMusical.pause();
       reprodutoMusical.skip();
       reprodutoMusical.skip();
       reprodutoMusical.skip();
       reprodutoMusical.back();
       reprodutoMusical.play();

       System.out.println("Música tocando? " + reprodutoMusical.play);
       System.out.println("A música que está tocando no momento é a: " +reprodutoMusical.music);

       System.out.println();

       aparelhoTelefonico.enviarMensagem();
       aparelhoTelefonico.receberMensagem();
       aparelhoTelefonico.receberLigacao();
       aparelhoTelefonico.fazerLigacao();

       System.out.println(aparelhoTelefonico.enviarMensagem);
       System.out.println(aparelhoTelefonico.receberMensagem);
       System.out.println(aparelhoTelefonico.recebendoLigacao);

       aparelhoTelefonico.atenderLigacao = false;
       
       if(aparelhoTelefonico.atenderLigacao == true){
        System.out.println("Olá, quem está falando?");
       }else{
        System.out.println("Você recusou a ligação...");
       }

       System.out.println(aparelhoTelefonico.ligacao);

       aparelhoTelefonico.atendeu = false;

       if(aparelhoTelefonico.atendeu == true){
        System.out.println("Alô!!?");
       }else{
        System.out.println("Fulano não atendeu...");
       }

       System.out.println();

       navegadorInternet.navegarInternet();
       navegadorInternet.abrirPagina = true;

       if(navegadorInternet.abrirPagina == true){
        System.out.println("Você acessou a página com sucesso!");
       }else{
        System.out.println("Ocorreu um erro ao acessar a página...");
       }

       navegadorInternet.fecharPagina();

    }
}


