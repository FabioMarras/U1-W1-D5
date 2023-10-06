package entities;

import Video.TrackVideo;

public class VideoMult implements Multimedia {
    private String titolo;
    private int durata;
    private int luminosità;
    private String volume = "!!";

    public VideoMult(String titolo, int durata, int luminosità) {
        this.titolo = titolo;
        this.durata = durata;
        this.luminosità = luminosità;
        this.volume = volume;
    }

    public void playMult() {
        System.out.println("Riproduzione del video: " + titolo);
        System.out.println("Durata: " + durata + " minuti");
//        System.out.println("Luminosità:" + luminosità);
//        System.out.println("Volume" + volume);
        StampaVideoLuminosità(luminosità);
        StampaVideoVolume(volume);
        StampaVideoNome(durata);
    }

    public void StampaVideoLuminosità(int luminosità) {

        if (luminosità == 0) {
            System.out.println("");
        } else if (luminosità == 1) {
            System.out.println("*");
        } else if (luminosità == 2) {
            System.out.println("**");
        } else if (luminosità == 3) {
            System.out.println("***");
        }  else if (luminosità == 4) {
            System.out.println("****");
        }  else if (luminosità == 5) {
            System.out.println("*****");
        }
    }
    public void StampaVideoVolume(String volume) {

        if (volume.length() == 0 ) {
            System.out.println("");
        } else if (volume.length() == 1) {
            System.out.println("!");
        } else if (volume.length() == 2) {
            System.out.println("!!");
        } else if (volume.length() == 3) {
            System.out.println("!!!");
        } else if (volume.length() == 4) {
            System.out.println("!!!!");
        } else if (volume.length() == 5) {
            System.out.println("!!!!");
        }
    }
    public void StampaVideoNome(int durata) {
        if (durata > 0 && durata <= 60) {
            System.out.println(titolo);
        } else if (durata > 60 && durata <= 120) {
            System.out.println(titolo + titolo);
        } else if (durata > 120 && durata <= 180) {
            System.out.println(titolo + titolo + titolo);
        } else if (durata > 180 && durata <= 240) {
            System.out.println(titolo + titolo + titolo + titolo);
        }
    }
   /* public void play2(TrackVideo video){
        StampaVideoNome(video);
        StampaVideoVolume(video);
        StampaVideoLuminosità(video);
    }*/
}
