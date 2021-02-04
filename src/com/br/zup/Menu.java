package com.br.zup;

public class Menu {

    public static String menuInicial(){
        IO.saidaDados("Digite: \nCachorro\nGato\nGalo");
        String resposta = IO.entradaDados().nextLine();
        return resposta;
    }
}
