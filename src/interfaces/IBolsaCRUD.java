package interfaces;

import java.util.ArrayList;
import java.util.Objects;

public interface IBolsaCRUD {

    ArrayList<Objects> listaItem = new ArrayList<>();

    public void adicionarItem(Object item);

    public boolean removerItem(int index);

    public boolean buscarItem(int index);

    public boolean atualizarItem(Object item, int index);

    public Object listarItem();
}
