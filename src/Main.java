import java.util.Scanner;
import Audio.Audio;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Scegli un Brano tra: BRANO1 o BRANO2 o BRANO3");
        String scelta = input.nextLine();
        Audio song = new Audio();
        song.sceltaBrano(scelta);
        input.close();
    }
}