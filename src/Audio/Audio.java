package Audio;

public class Audio {
    public void sceltaBrano(String scelta) {
        switch (scelta) {
            case "BRANO1", "Brano1", "brano1":
                System.out.println("Hai scelto BRANO1");
                break;
            case "BRANO2":
                System.out.println("Hai scelto BRANO2");
                break;
            case "BRANO3":
                System.out.println("Hai scelto BRANO3");
                break;
            case "BRANO4":
                System.out.println("Hai scelto BRANO4");
                break;
            case "BRANO5":
                System.out.println("Hai scelto BRANO5");
                break;
            default:
                System.out.println("Non abbiamo questo brano :(");
                break;
        }
    }
}
