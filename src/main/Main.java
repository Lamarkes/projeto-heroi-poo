package main;

import dao.BolsaDAO;
import dao.LojinhaDAO;
import interfaces.ILojaCRUD;
import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BolsaDAO bolsaDeItens = new BolsaDAO();
        Foice foice = new Foice();
        Machado machado = new Machado();
        Heroi heroi;
        Vilao vilao;
        ILojaCRUD lojinha = new LojinhaDAO();
        lojinha.adicionaProduto("Pocao", 10.1f);
        lojinha.adicionaProduto("Espada rara", 100);
        lojinha.adicionaProduto("Armadura Completa", 101);

        vilao = new Vilao("Zeze",20);
        System.out.println("O vilao Zeze apareceu!, escolha uma arma para derrota-lo!");
        System.out.println("Qual arma o heroi vai utilizar: \n1- Foice\n2- Machado");
        System.out.print("-->");
        int escolha = sc.nextInt();
        try {
            if (escolha == 1) {
                System.out.println("Escolheu a foice");
                heroi = new Heroi("Luiz", 2, 10, bolsaDeItens, foice);
                heroi.atacar();
            } else if (escolha == 2) {
                System.out.println("Escolheu o machado");
                heroi = new Heroi("Luiz", 2, 10, bolsaDeItens, machado);
                heroi.atacar();
            } else {
                System.out.println("Informe apenas os valores validos!");
            }
        }catch (InputMismatchException e){
            System.out.println("Informe apenas numeros!");
        }
        System.out.println("O vilao morreu :(");
        System.out.println("Agora que o vilao foi derrotado, va para a loja e pegue o que for necessario!");
        System.out.println(lojinha.listarProdutos());

    }
}
