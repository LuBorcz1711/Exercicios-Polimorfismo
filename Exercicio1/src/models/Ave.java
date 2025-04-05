package models;

public class Ave extends Animal{

    protected float envergaduraAssas;

    public Ave(String nome, int idade, float peso, float envergaduraAssas){
        super(nome, idade, peso);
        this.envergaduraAssas = envergaduraAssas;
    }

    public double getEnvergadoraAssas(){
        return envergaduraAssas;
    }

    @Override
    public void fazerSom(){
        System.out.println("Som de uma ave.");
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Peso: " + getPeso() + " Envergadura das assas: " + getEnvergadoraAssas());
    }
}
