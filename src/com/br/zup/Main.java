package com.br.zup;

public class Main {

    public static void main(String[] args) {
        String retornoMenu = Menu.menuInicial();
        ControleAnimais.nomearAnimal(retornoMenu);
        ControleAnimais.dizerFrase(retornoMenu);
    }
}
