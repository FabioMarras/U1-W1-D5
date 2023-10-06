package entities;

public class AudioNew implements Multimedia{
    private String nome;
    private int durata;
    private String volume;

    public AudioNew(String nome, int durata) {
        this.nome = nome;
        this.durata = durata;
    }

    public void playMult() {
        System.out.println("Riproduzione dell'audio: " + nome);
        System.out.println("Durata: " + durata + " secondi");
    }
}
