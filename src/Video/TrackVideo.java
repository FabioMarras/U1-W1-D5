package Video;

public enum TrackVideo {
    VIDEO1("Video 1", 2 , "!!" , 200),
    VIDEO2("Video 2", 3, "!!!!", 60),
    VIDEO3("Video 3", 1, "!!!", 60),
    VIDEO4("Video 4", 5, "!!", 60),
    VIDEO5("Video 5", 2, "!", 60),
    ;

    private String nome;
    private int luminosità;
    private String volume;
    private int durata;

    TrackVideo(String nome, int luminosità, String volume, int durata){
        this.nome = nome;
        this.luminosità = luminosità;
        this.volume = volume;
        this.durata = durata;
    }

    public String getNome() {
        return nome;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public String getVolumeVideo() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setVolumeVideo(String volume) {
        this.volume = volume;
    }
}
