package Multiplayer;

public class Rec  extends ContenutoMulti{
    public String durataaudio;
    public String volumeaudio;
    private int durata;
    private int volume;


    public Rec (String titolo, int durata, int volume) {
        super(titolo); //costruttorre contenutomulti
        this.durata = durata;
        this.volume = volume;
    }

    public void volumeUp () {
        volume++; //metodo per ++volume di 1
    }

    public void volumeDown() {
        volume--;
    }

    public void play(){
        for (int i = 0 ; i<durata ;i++){
            System.out.println(titolo + " " + "!" .repeat(volume));
        }
    }


}
