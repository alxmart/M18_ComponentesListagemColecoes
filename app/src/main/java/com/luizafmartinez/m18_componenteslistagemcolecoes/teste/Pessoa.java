package com.luizafmartinez.m18_componenteslistagemcolecoes.teste;

public class Pessoa {

    private String nome = "";
    private int idade = 0;

    public String getNome() {
        System.out.println("Get: " + nome);
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        System.out.println("Set: " + nome);
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
