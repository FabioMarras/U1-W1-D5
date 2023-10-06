package entities;

import Audio.TrackList;

public class AudioNew implements Multimedia{
    private String nome;
    private int durata;
    private String volume = "!!!";

    public AudioNew(String nome, int durata) {
        this.nome = nome;
        this.durata = durata;
    }

    public void playMult() {
        System.out.println("Riproduzione dell'audio: " + nome);
        System.out.println("Durata: " + durata + " secondi");
        play(durata);
        abbassaVolume(volume);
        StampaVideoVolume(volume);
    }

    public void play(int durata) {
        int durataTotale = this.durata;
        int minuto = 60;
        for (int i = 0; i < durataTotale; i += minuto) {
            System.out.println(this.nome);
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
    public void alzaVolumeVideo(String volume) {
        if (volume.length() == 1) {
            this.setVolume("!!");
        } else if (volume.length() == 2) {
            this.setVolume("!!!");;
        } else if (volume.length() == 3) {
            this.setVolume("!!!!");;
        } else if (volume.length() == 4) {
            this.setVolume("!!!!!");;
        } else {
            System.out.println("Volume già al massimo!");
        }
    }
    public void abbassaVolume(String volume) {
        if (volume.length() == 5) {
            this.setVolume("!!!!");
        } else if (volume.length() == 4) {
            this.setVolume("!!!");;
        } else if (volume.length() == 3) {
            this.setVolume("!!");;
        } else if (volume.length() == 2) {
            this.setVolume("!");;
        } else {
            System.out.println("Volume già al minimo!");
        }
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
