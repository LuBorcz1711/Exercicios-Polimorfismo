package models;

public class Papagaio extends Ave{

    protected float envergaduraAssas;

    public Papagaio(String nome, int idade, float peso, float envergaduraAssas){
        super(nome, idade, peso, envergaduraAssas);
    }

    @Override
    public void fazerSom(){
        System.out.println("Som de uma ave.");
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Peso: " + getPeso() + " Envergadura das assas: " + getEnvergadoraAssas());
    }

    public void voar(){
        System.out.println("O papagaio está voando.");
    }
}