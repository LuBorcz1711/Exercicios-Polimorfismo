package models;

public class Mamifero extends Animal{

    protected double velocidade;

    public Mamifero(String nome, int idade, float peso, double velocidade){
        super(nome, idade, peso);
        this.velocidade = velocidade;
    }

    public double getVelocidade(){
        return velocidade;
    }

    @Override
    public void fazerSom(){
        System.out.println("Som de um mamífero.");
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Peso: " + getPeso() + " Velocidade: " + getVelocidade());
    }
}
