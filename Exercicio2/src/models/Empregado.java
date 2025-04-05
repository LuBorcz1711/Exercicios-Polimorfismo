package models;

public abstract class Empregado {
    protected String nome;
    protected double salarioBase;

    public Empregado(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalario();

    public abstract String tipoEmpregado();

    public void exibirDetalhes(){
        System.out.println("Nome do empregado: " + getNome() + " - Salário: " + calcularSalario() + " reais.");
    }
}
