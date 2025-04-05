package models;

public class EmpregadoAssalariado extends Empregado{

    public EmpregadoAssalariado(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public String tipoEmpregado() {
        return "Assalariado";
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome do empregado: " + getNome() + " - Salário: " + calcularSalario() + " reais.");
    }
}
