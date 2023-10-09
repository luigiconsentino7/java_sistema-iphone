package iphone;

public class NavegadorInternet {
    String fecharPagina;
    String navegar;
    boolean abrirPagina;
    
    public void navegarInternet(){
       navegar = "...Loading";
    }

    public void abrirPagina(){
        abrirPagina = true;
    }

    public void fecharPagina(){
        fecharPagina = "Você fechou a página.";
    }
}
