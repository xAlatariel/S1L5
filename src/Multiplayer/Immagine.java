package Multiplayer;

public class Immagine extends ContenutoMulti{
    public String luminositaimg;
    private int luminosità;

    public Immagine(String titolo, int luminoistà){
        super (titolo);
        this.luminosità = luminoistà;
    }

    //metodo per luminosita + o -
    public void luminositàUp(){
        luminosità++;
    }
    public void luminositàDown(){
        luminosità--;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosità));
    }

}


