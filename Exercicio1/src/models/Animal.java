package models;

public class Animal {

    protected String nome;
    protected int idade;
    protected float peso;

    public Animal(String nome, int idade, float peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public float getPeso(){
        return peso;
    }

    public void fazerSom(){
        System.out.println("Som de um animal.");
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Peso: " + getPeso());
    }
}
