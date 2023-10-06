package Immagine;

public enum ImmagineList {
    IMMAGINE1("Foto 1", 2 ),
    IMMAGINE2("Foto 2", 3),
    IMMAGINE3("Foto 3", 1),
    IMMAGINE4("Foto 4", 5),
    IMMAGINE5("Foto 5", 2),
    ;
    private String nome;
    private int luminosità;


    ImmagineList(String nome, int luminosità){
        this.nome = nome;
        this.luminosità = luminosità;
    }

    public String getNome() {
        return nome;
    }

    public int getLuminosità() {
        return luminosità;
    }
}
