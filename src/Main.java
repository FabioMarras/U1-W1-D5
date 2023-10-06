import java.util.Scanner;
import Audio.Audio;
import Immagine.Immagine;
import Video.Video;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
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
        input.close();
    }
}