package model;

public class Personagem {

    private String nome;
    private int nivelDeForca;

    public Personagem(String nome,
                      int nivelDeForca){
        this.nivelDeForca = nivelDeForca;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public int getNivelDeForca(){
        return nivelDeForca;
    }
    public void setNivelDeForca(int nivelDeForca){
        this.nivelDeForca = nivelDeForca;
    }

    @Override
    public String toString() {
        return "Personagem:\n"+
                "Nome:"+nome+
                "\nNivel de forca:"+nivelDeForca;
    }
}
