import java.util.Scanner;
import Audio.Audio;
import Immagine.Immagine;
import Video.Video;
import entities.AudioNew;
import entities.Multimedia;
import entities.VideoMult;

public class Main {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Scegli un Brano tra: BRANO1 o 2/3/4/5");
        String scelta = input.nextLine();
        Audio song = new Audio();
        song.sceltaBrano(scelta);
        System.out.println("Scegli un Video tra: VIDEO1 o 2/3/4/5");
        String sceltaVideo = input.nextLine();
        Video vid = new Video();
        vid.sceltaVideo(sceltaVideo);
        System.out.println("Scegli un immagine tra: IMMAGINE1 O 2/3/4/5");
        String sceltaImmagine = input.nextLine();
        Immagine foto = new Immagine();
        foto.sceltaImmagine(sceltaImmagine);
        input.close();*/
        Scanner input = new Scanner(System.in);
        Multimedia[] list = new Multimedia[5];
        for (int i = 0; i < 1; i++) {
            System.out.println("Preferisci un audio o un video?");
            String tipo = input.nextLine();
            if ("audio".equals(tipo)) {
                System.out.println("Inserisci il nome del tuo audio");
                String nome = input.nextLine();
                System.out.println("Inserisci la durata in secondi");
                int durata = input.nextInt();
                input.nextLine();
//                System.out.println("Inserisci il volume da ! a !!!!!");
//                int volume = input.nextInt();
                list[i] = new AudioNew(nome, durata);
            }
            if ("video".equals(tipo)) {
                System.out.println("Inserisci il nome del tuo video");
                String nome = input.nextLine();
                System.out.println("Inserisci la durata in secondi");
                int durata = input.nextInt();
                System.out.println("Inserisci la luminosità da 1 a 5 ");
                int luminosità = input.nextInt();
                input.nextLine();
                list[i] = new VideoMult(nome, durata, luminosità);
            }
        }
        System.out.println("Quale vuoi eseguire? da 0 a 4? ");
        int sceltaUtente = input.nextInt();
        if (sceltaUtente == 0) {
            list[sceltaUtente].playMult();
        } else if (sceltaUtente == 1) {
            list[sceltaUtente].playMult();
        }else if (sceltaUtente == 2) {
            list[sceltaUtente].playMult();
        } else if (sceltaUtente == 3) {
            list[sceltaUtente].playMult();
        } else if (sceltaUtente == 4) {
            list[sceltaUtente].playMult();
        } else {
            System.out.println("Scelta non valida, mi dispiace :(");
        }

        input.close();
    }
}