package models;

public class Reptil extends Animal{

    protected float tempCorporal;

    public Reptil(String nome, int idade, float peso, float tempCorporal){
        super(nome, idade, peso);
        this.tempCorporal = tempCorporal;
    }

    public double getTempCorporal(){
        return tempCorporal;
    }

    @Override
    public void fazerSom(){
        System.out.println("Som de um réptil.");
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Peso: " + getPeso() + " Temperatura corporal: " + getTempCorporal());
    }
}
