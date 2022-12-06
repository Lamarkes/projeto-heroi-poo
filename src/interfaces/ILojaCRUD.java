package interfaces;

import java.util.HashMap;

public interface ILojaCRUD {

    public void adicionaProduto(String nomeProduto,float preco);
    public boolean removeProduto(String nomeProduto);

    public String listarProdutos();
}
