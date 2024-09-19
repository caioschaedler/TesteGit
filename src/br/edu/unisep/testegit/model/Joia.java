package br.edu.unisep.testegit.model;

public class Joia {
    private String nome;
    private int idade;
    private boolean sexo;
    private int ano;

    public Joia(String nome, int idade, boolean sexo, int ano) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ano = ano;
    }

    public boolean ligar(){
        return this.sexo;
    }
}
