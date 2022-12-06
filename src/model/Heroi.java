package model;

import dao.BolsaDAO;
import interfaces.IUtilizar;

public class Heroi extends Personagem implements IUtilizar{

    private int nivelDeVida;
    private BolsaDAO bolsaDeItens;
    private IUtilizar utlizarFerramenta;


    public Heroi(String nome,
                 int nivelDeForca,
                 int nivelDeVida,
                 BolsaDAO bolsaDeItens,
                 IUtilizar utlizarFerramenta) {
        super(nome, nivelDeForca);
        this.nivelDeVida = nivelDeVida;
        this.bolsaDeItens = bolsaDeItens;
        this.utlizarFerramenta = utlizarFerramenta;
    }

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public BolsaDAO getBolsaDeItens() {
        return bolsaDeItens;
    }

    public IUtilizar getUtlizarFerramenta() {
        return utlizarFerramenta;
    }

    @Override
    public void atacar() {
        this.utlizarFerramenta.atacar();
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "nivelDeVida=" + nivelDeVida +
                ", bolsaDeItens=" + bolsaDeItens +
                ", utlizarFerramenta=" + utlizarFerramenta +
                '}';
    }
}
