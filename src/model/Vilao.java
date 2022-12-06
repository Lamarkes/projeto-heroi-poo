package model;

public class Vilao extends Personagem {

    int nivelDeForca;

    public Vilao(String nome, int nivelDeForca) {
        super(nome, nivelDeForca);
        this.nivelDeForca = nivelDeForca;
    }

    @Override
    public int getNivelDeForca() {
        return nivelDeForca;
    }
    @Override
    public String toString() {
        return "Vilao{" +
                "nivelDeForca=" + nivelDeForca +
                '}';
    }
}
