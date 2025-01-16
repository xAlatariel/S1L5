package Multiplayer;

public class Video  extends ContenutoMulti{
    public String duratavideo;
    public String volumevideo;
    public String luminositavideo;
    private int durata;
    private int volume;
    private int luminosità;

    public Video (String titolo, int durata, int volume,int luminosità){ //costruttore x video
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }
   //metodo per volume + o -
    public void volumeUp() {
        volume++;
    }
    public void volumeDown(){
        volume--;
    }
    //metodo per luminosita + o -
    public void luminositàUp(){
        luminosità++;
    }
    public void luminositàDown(){
        luminosità--;
    }


    public void play (){
        for (int i = 0; i<durata; i++){
            System.out.println(titolo + " " + "!" .repeat(volume) + " " + "*" .repeat(luminosità));
        }
    }





    
}
