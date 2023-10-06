package Audio;

public enum TrackList {
    BRANO1("Brano 1", 180),
    BRANO2("Brano 2", 180),
    BRANO3("Brano 3", 180),
    BRANO4("Brano 4", 180),
    BRANO5("Brano 5", 180),
    ;

    private String nome;
    private int durata;

    private TrackList( String nome, int durata){
        this.nome = nome;
        this.durata = durata;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }
}
