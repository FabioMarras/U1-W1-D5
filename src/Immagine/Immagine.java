package Immagine;

import Audio.TrackList;

public class Immagine {
    public void sceltaImmagine(String scelta) {
        switch (scelta) {
            case "IMMAGINE1", "Immagine1", "immagine1":
                show(ImmagineList.IMMAGINE1);
               break;
            case "IMMAGINE2", "Immagine2", "immagine2":
                show(ImmagineList.IMMAGINE2);
                break;
            case "IMMAGINE3", "Immagine3", "immagine3":
                show(ImmagineList.IMMAGINE3);
                break;
            case "IMMAGINE4", "Immagine4", "immagine4":
                show(ImmagineList.IMMAGINE4);
                break;
            case "IMMAGINE5", "Immagine5", "immagine5":
                show(ImmagineList.IMMAGINE5);
                break;
            default:
                System.out.println("Non abbiamo quest'immagine :(");
                break;
        }
    }

    public void show(ImmagineList img) {
        int LuminositàTotale = img.getLuminosità();
        if (LuminositàTotale == 0){
            System.out.println(img.getNome());
        }  else if (LuminositàTotale == 1){
            System.out.println(img.getNome() + " *");
        }  else if (LuminositàTotale == 2){
            System.out.println(img.getNome() + " **");
        }  else if (LuminositàTotale == 3){
            System.out.println(img.getNome() + " ***");
        } else if (LuminositàTotale == 4){
            System.out.println(img.getNome() + " ****");
        } else if (LuminositàTotale == 5){
            System.out.println(img.getNome() + " *****");
        }
    }
}
