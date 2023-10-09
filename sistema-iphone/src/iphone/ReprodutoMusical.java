package iphone;

public class ReprodutoMusical {
    boolean play = true;
    int music = 1;


    public void play(){
        play = true;
    }

    public void pause(){
        play = false;
    }

    public void skip(){
        music++;
    }

    public void back(){
        music--;
    }
}
