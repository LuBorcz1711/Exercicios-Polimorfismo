package models;

public class EmpregadoComissionado extends Empregado{
    protected double vendas;
    protected double percentualComissao;

    public EmpregadoComissionado(String nome, double salarioBase, double vendas, double percentualComissao){
        super(nome, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
    public double getVendas() {
        return vendas;
    }

    public double calcularSalario(){
        return salarioBase + (vendas * (percentualComissao/100));
    }

    public String tipoEmpregado() {
        return "Comissionado";
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome do empregado: " + getNome() + " - Salário: " + calcularSalario() + " reais.");
    }
}
