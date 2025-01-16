import Multiplayer.*;
import java.util.Scanner;

import Multiplayer.*;
import java.util.Scanner;

public class Main {
    public static boolean Player = true;

    public static void main(String[] args) {
        ContenutoMulti[] elementi = new ContenutoMulti[5];
        Scanner scanner = new Scanner(System.in);

        // Ciclo per la creazione degli elementi
        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Quale tipo vuoi produrre?: ");
            System.out.println("1 - Rec");
            System.out.println("2 - Video");
            System.out.println("3 - Img");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Titolo:");
            String titolo;

            switch (scelta) {
                case 1: {
                    System.out.println("Inserisci i dati Rec");
                    System.out.println("Inserisci titolo: ");
                    titolo = scanner.nextLine();
                    System.out.println("Durata audio:");
                    int durataaudio = scanner.nextInt();
                    System.out.println("Inserisci volume:");
                    int volumeaudio = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Rec(titolo, durataaudio, volumeaudio);
                    break;
                }
                case 2: {
                    System.out.println("Inserisci i dati del video");
                    System.out.println("Inserisci titolo: ");
                    titolo = scanner.nextLine();
                    System.out.println("Durata video:");
                    int duratavideo = scanner.nextInt();
                    System.out.println("Inserisci volume:");
                    int volumevideo = scanner.nextInt();
                    System.out.println("Inserisci luminosità:");
                    int luminositavideo = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Video(titolo, duratavideo, volumevideo, luminositavideo);
                    break;
                }
                case 3: {
                    System.out.println("Inserisci titolo: ");
                    titolo = scanner.nextLine();
                    System.out.println("Inserisci i dati dell'immagine");
                    System.out.println("Inserisci luminosità");
                    int luminositaimg = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Immagine(titolo, luminositaimg);
                    break;
                }
                default:
                    System.out.println("Scegli tra 1 o 3!");
                    i--;  // input non è valido lo fo inserire di nuovo
                    break;
            }
        }

        contenuto(scanner, elementi);
    }

    public static void contenuto(Scanner scanner, ContenutoMulti[] elementi) {
        int contenutoscelto;

        while (Player) {
            System.out.println("Quale contenuto vuoi stampare? Scegli un numero da 1 a 5 oppure 0 per uscire:");
            contenutoscelto = scanner.nextInt();
            scanner.nextLine();

            switch (contenutoscelto) {
                case 0: {
                    System.out.println("Uscita dal player.");
                    Player = false;
                    break;
                }
                case 1: {
                    if (elementi[0] instanceof Rec) {
                        System.out.println("è un audio");
                    } else if (elementi[0] instanceof Video) {
                        System.out.println("è un video");
                    } else {
                        System.out.println("è una img");
                    }
                    break;
                }
                case 2: {
                    if (elementi[1] instanceof Rec) {
                        System.out.println("è un audio");
                    } else if (elementi[1] instanceof Video) {
                        System.out.println("è un video");
                    } else {
                        System.out.println("è una img");
                    }
                    break;
                }
                case 3: {
                    if (elementi[2] instanceof Rec) {
                        System.out.println("è un audio");
                    } else if (elementi[2] instanceof Video) {
                        System.out.println("è un video");
                    } else {
                        System.out.println("è una img");
                    }
                    break;
                }
                case 4: {
                    if (elementi[3] instanceof Rec) {
                        System.out.println("è un audio");
                    } else if (elementi[3] instanceof Video) {
                        System.out.println("è un video");
                    } else {
                        System.out.println("è una img");
                    }
                    break;
                }
                case 5: {
                    if (elementi[4] instanceof Rec) {
                        System.out.println("è un audio");
                    } else if (elementi[4] instanceof Video) {
                        System.out.println("è un video");
                    } else {
                        System.out.println("è una img");
                    }
                    break;
                }
                default: {
                    System.out.println("Inserisci un oggetto corretto.");
                    break;
                }
            }
        }
    }

}
