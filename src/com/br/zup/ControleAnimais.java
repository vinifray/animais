package com.br.zup;

public class ControleAnimais {
    static Animal cachorro = new Animal("auauau");
    static Animal gato = new Animal("miau");
    static Animal galo = new Animal("cocorico");

    public static void dizerFrase(String animal){
        if(animal.equalsIgnoreCase("cachorro")){
            IO.saidaDados(cachorro.getNome()+" faz "+cachorro.getSom());
        }else if (animal.equalsIgnoreCase("gato")){
            IO.saidaDados(gato.getNome()+" faz "+gato.getSom());
        }else if(animal.equalsIgnoreCase("galo")){
            IO.saidaDados(galo.getNome()+" faz "+galo.getSom());
        }
    }

    public static void nomearAnimal(String animal){
        IO.saidaDados("Digite o nome do animal");
        String nome = IO.entradaDados().nextLine();
        if(animal.equalsIgnoreCase("cachorro")){
            cachorro.setNome(nome);
        }else if (animal.equalsIgnoreCase("gato")){
            gato.setNome(nome);
        }else if(animal.equalsIgnoreCase("galo")){
            galo.setNome(nome);
        }
    }
}
