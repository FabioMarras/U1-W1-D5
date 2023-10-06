package entities;

public class ImmagineNew implements Multimedia{
    private String nome;
    private int luminosità;

    public ImmagineNew(String nome, int luminosità) {
        this.nome = nome;
        this.luminosità = luminosità;
    }

    public void playMult() {
        show(luminosità);
    }
    public void show(int luminosità) {
        if (this.luminosità == 0){
            System.out.println(nome);
        }  else if (this.luminosità == 1){
            System.out.println(nome + " *");
        }  else if (this.luminosità == 2){
            System.out.println(nome + " **");
        }  else if (this.luminosità == 3){
            System.out.println(nome + " ***");
        } else if (this.luminosità == 4){
            System.out.println(nome + " ****");
        } else if (this.luminosità == 5){
            System.out.println(nome + " *****");
        }
    }
}
