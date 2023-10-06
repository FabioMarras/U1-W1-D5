package Audio;

public enum TrackList {
    BRANO1("Brano 1", 80, "!!!"),
    BRANO2("Brano 2", 180, "!!"),
    BRANO3("Brano 3", 180, "!!"),
    BRANO4("Brano 4", 180, "!!"),
    BRANO5("Brano 5", 180, "!!"),
    ;

    private String nome;
    private int durata;
    private String volume;

    TrackList(String nome, int durata, String volume){
        this.nome = nome;
        this.durata = durata;
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
