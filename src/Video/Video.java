package Video;

public class Video {
    public void sceltaVideo(String sceltaVideo) {
        switch (sceltaVideo) {
            case "VIDEO1", "Video1", "video1":
                play(TrackVideo.VIDEO1);
                System.out.println("Hai scelto: " + TrackVideo.VIDEO1.getNome() + " durata: " +  TrackVideo.VIDEO1.getDurata() + " il volume è: " + TrackVideo.VIDEO1.getVolumeVideo() + " luminosità: " + TrackVideo.VIDEO1.getLuminosità());
                alzaVolumeVideo(TrackVideo.VIDEO1);
                System.out.println("Hai scelto: " + TrackVideo.VIDEO1.getNome() + " durata: " +  TrackVideo.VIDEO1.getDurata() + " il volume è: " + TrackVideo.VIDEO1.getVolumeVideo() + " luminosità: " + TrackVideo.VIDEO1.getLuminosità());
                break;
            case "VIDEO2", "Video2", "video2":
                play(TrackVideo.VIDEO2);
                System.out.println("Hai scelto: " + TrackVideo.VIDEO2.getNome() + " durata: " +  TrackVideo.VIDEO2.getDurata() + " il volume è: " + TrackVideo.VIDEO2.getVolumeVideo() + " luminosità: " + TrackVideo.VIDEO2.getLuminosità());
                break;
            case "VIDEO3", "Video3", "video3":
                play(TrackVideo.VIDEO3);
                System.out.println("Hai scelto: " + TrackVideo.VIDEO3.getNome() + " durata: " +  TrackVideo.VIDEO3.getDurata() + " il volume è: " + TrackVideo.VIDEO3.getVolumeVideo() + " luminosità: " + TrackVideo.VIDEO3.getLuminosità());
                break;
            case "VIDEO4", "Video4", "video4":
                play(TrackVideo.VIDEO4);
                System.out.println("Hai scelto: " + TrackVideo.VIDEO4.getNome() + " durata: " +  TrackVideo.VIDEO4.getDurata() + " il volume è: " + TrackVideo.VIDEO4.getVolumeVideo() + " luminosità: " + TrackVideo.VIDEO4.getLuminosità());
                break;
            case "VIDEO5", "Video5", "video5":
                play(TrackVideo.VIDEO5);
                System.out.println("Hai scelto: " + TrackVideo.VIDEO5.getNome() + " durata: " +  TrackVideo.VIDEO5.getDurata() + " il volume è: " + TrackVideo.VIDEO5.getVolumeVideo() + " luminosità: " + TrackVideo.VIDEO5.getLuminosità());
                break;
            default:
                System.out.println("Non abbiamo questo video :(");
                break;
        }
    }
    public void StampaVideoNome(TrackVideo video) {
        int durataTotale = video.getDurata();
        if (durataTotale > 0 && durataTotale <= 60) {
            System.out.println(video.getNome());
        } else if (durataTotale > 60 && durataTotale <= 120) {
            System.out.println(video.getNome() + video.getNome());
        } else if (durataTotale > 120 && durataTotale <= 180) {
            System.out.println(video.getNome() + video.getNome() + video.getNome());
        } else if (durataTotale > 180 && durataTotale <= 240) {
            System.out.println(video.getNome() + video.getNome() + video.getNome() + video.getNome());
        }
    }
    public void StampaVideoVolume(TrackVideo video) {
        String volumeTotale = video.getVolumeVideo();
        if (volumeTotale.length() == 0 ) {
            System.out.println("");
        } else if (volumeTotale.length() == 1) {
            System.out.println("!");
        } else if (volumeTotale.length() == 2) {
            System.out.println("!!");
        } else if (volumeTotale.length() == 3) {
            System.out.println("!!!");
        } else if (volumeTotale.length() == 4) {
            System.out.println("!!!!");
        } else if (volumeTotale.length() == 5) {
                System.out.println("!!!!");
            }
    }
    public void StampaVideoLuminosità(TrackVideo video) {
        int luminositàTotale = video.getLuminosità();

        if (luminositàTotale == 0) {
            System.out.println("");
        } else if (luminositàTotale == 1) {
            System.out.println("*");
        } else if (luminositàTotale == 2) {
            System.out.println("**");
        } else if (luminositàTotale == 3) {
            System.out.println("***");
        }  else if (luminositàTotale == 4) {
            System.out.println("****");
        }  else if (luminositàTotale == 5) {
            System.out.println("*****");
        }
    }
    public void alzaVolumeVideo(TrackVideo video) {
        String volumeAttuale = video.getVolumeVideo();

        if (volumeAttuale.length() == 1) {
            TrackVideo.VIDEO1.setVolumeVideo("!!");
        } else if (volumeAttuale.length() == 2) {
            TrackVideo.VIDEO2.setVolumeVideo("!!!");;
        } else if (volumeAttuale.length() == 3) {
            TrackVideo.VIDEO3.setVolumeVideo("!!!!");;
        } else if (volumeAttuale.length() == 4) {
            TrackVideo.VIDEO4.setVolumeVideo("!!!!!");;
        } else {
            System.out.println("Volume già al massimo!");
        }
    }

    public void abbassaVolume(TrackVideo video) {
        String volumeAttuale = video.getVolumeVideo();
        if (volumeAttuale.length() == 5) {
            TrackVideo.VIDEO1.setVolumeVideo("!!!!");
        } else if (volumeAttuale.length() == 4) {
            TrackVideo.VIDEO2.setVolumeVideo("!!!");;
        } else if (volumeAttuale.length() == 3) {
            TrackVideo.VIDEO3.setVolumeVideo("!!");;
        } else if (volumeAttuale.length() == 2) {
            TrackVideo.VIDEO4.setVolumeVideo("!");;
        } else {
            System.out.println("Volume già al minimo!");
        }
    }
    public void play(TrackVideo video){
        StampaVideoNome(video);
        StampaVideoVolume(video);
        StampaVideoLuminosità(video);
    }
}

/* durata = nome, ! = volume, * lumonisità */