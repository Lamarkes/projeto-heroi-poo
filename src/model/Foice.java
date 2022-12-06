package model;

import interfaces.IUtilizar;

public class Foice implements IUtilizar {


    @Override
    public void atacar() {
        System.out.println("Esta atacando com a Foice!");
    }
}
