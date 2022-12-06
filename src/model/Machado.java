package model;

import interfaces.IUtilizar;

public class Machado implements IUtilizar {
    @Override
    public void atacar() {
        System.out.println("Utilizando o machado!");
    }
}
