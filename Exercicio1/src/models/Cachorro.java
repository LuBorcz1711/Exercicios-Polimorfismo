package models;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, int idade, float peso, float velocidade) {
        super(nome, idade, peso, velocidade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Som de um mamífero.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Peso: " + getPeso());
    }

    public void correr(){
        System.out.println("O cachorro está correndo.");
    }
}