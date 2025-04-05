package models;

public class Cobra extends Reptil{

    protected float tempCorporal;

    public Cobra(String nome, int idade, float peso, float tempCorporal){
        super(nome, idade, peso, tempCorporal);
    }

    @Override
    public void fazerSom(){
        System.out.println("Som de um réptil.");
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Peso: " + getPeso() + " Temperatura corporal: " + getTempCorporal());
    }

    public void rastejar(){
        System.out.println("A cobra está rastejando");
    }
}