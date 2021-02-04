package com.br.zup;

public class Animal {
    private String nome;
    private String som;

    public Animal(String som){
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public String getSom() {
        return som;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
