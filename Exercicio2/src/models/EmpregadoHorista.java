package models;

public class EmpregadoHorista extends Empregado{
    protected int horasTrabalhadas;
    protected double valorHora;

    public EmpregadoHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora){
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public double getValorHora() {
        return valorHora;
    }

    public double calcularSalario(){
        return horasTrabalhadas * valorHora;
    }

    public String tipoEmpregado() {
        return "Horista";
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome do empregado: " + getNome() + " - Salário: " + calcularSalario() + " reais.");
    }
}
