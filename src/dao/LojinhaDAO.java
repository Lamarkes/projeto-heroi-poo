package dao;

import interfaces.ILojaCRUD;

import java.util.HashMap;

public class LojinhaDAO implements ILojaCRUD {

    HashMap<String,Float>produto = new HashMap<>();

    @Override
    public void adicionaProduto(String nomeProduto,float preco) {
        produto.put(nomeProduto,preco);
    }

    @Override
    public boolean removeProduto(String nomeProduto) {
        if (produto.remove(nomeProduto) != null) {
            System.out.println("Produto removido!");
            return true;
        }else{
            System.out.println("O produto n existe");
            return false;
        }
    }

    @Override
    public String listarProdutos() {
        return "Produtos: "+produto;
    }

}
