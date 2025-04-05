package main;
import models.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Ariel", 6, 4.8F);
        animal.fazerSom();
        animal.exibirInformacoes();

        System.out.println(" ");
        Mamifero mami = new Mamifero("Zoe", 9, 7.5F, 40F);
        mami.fazerSom();
        mami.exibirInformacoes();

        System.out.println(" ");
        Ave ave = new Ave("Lora", 20, 0.500F,15.6F);
        ave.fazerSom();
        ave.exibirInformacoes();

        System.out.println(" ");
        Reptil re = new Reptil("Tutuga", 12, 2.7F,9F);
        re.fazerSom();
        re.exibirInformacoes();

        //subclasses
        System.out.println(" ");
        System.out.println("SUBCLASSES ");
        Cachorro dog = new Cachorro("Tiana", 5, 4.3F, 48F);
        dog.correr();
        dog.fazerSom();

        System.out.println(" ");
        Papagaio pag = new Papagaio("Lindo", 25, 0.5F, 14.9F);
        pag.voar();
        pag.fazerSom();

        System.out.println(" ");
        Cobra cobra = new Cobra("Jiboia", 3, 15.5F, 9.1F);
        cobra.rastejar();
        cobra.fazerSom();
    }
}