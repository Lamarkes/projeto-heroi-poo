package dao;

import interfaces.IBolsaCRUD;

import java.util.ArrayList;

public class BolsaDAO implements IBolsaCRUD {

    ArrayList<Object> bolsaDeItens;

    public BolsaDAO(){
        bolsaDeItens = new ArrayList<>();
    }


    @Override
    public void adicionarItem(Object item) {
        bolsaDeItens.add(item);
        System.out.println("Item adicionado");
    }

    @Override
    public boolean removerItem(int index) {
        if (bolsaDeItens.remove(index) != null){
            System.out.println("Item removido");
            return true;
        }

        return false;
    }

    @Override
    public boolean buscarItem(int index) {
        if (bolsaDeItens.get(index) == null){
            System.out.println("Nao existe este item na mochila");
            return false;
        }else{
            System.out.println(index+" Existe na mochila!");
        }
        return true;
    }

    @Override
    public boolean atualizarItem(Object item, int index) {
        if(bolsaDeItens.set(index, item)!= null){
            System.out.println("Item atualizado!");
            return true;
        }else{
            System.out.println("Nao existe este item!");
        }
        return false;
    }

    public void buscarItem(Object item){
        for (Object o: bolsaDeItens){
            if(o == item){
                System.out.println("Item: "+o);
                break;
            } else {
                System.out.println("Nao existe este item na mochila");
                break;
            }
        }
    }

    @Override
    public Object listarItem() {
            return "Bolsa: "+bolsaDeItens;
    }
}
