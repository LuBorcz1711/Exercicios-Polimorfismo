package main;
import models.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empregado> lista = new ArrayList<>();

        EmpregadoHorista horista = new EmpregadoHorista("Robson Carlos de Andrade", 0, 32, 95);
        EmpregadoComissionado comissionado = new EmpregadoComissionado("Juliana Gonçalves", 2000, 1450, 15);
        EmpregadoAssalariado assalariado = new EmpregadoAssalariado("Diogo Videira da Silva", 15700);

        lista.add(horista);
        lista.add(comissionado);
        lista.add(assalariado);

        for (Empregado empregado : lista){
            empregado.exibirDetalhes();
        }
        System.out.println(" ");

        double totalSalarios = 0;

        System.out.println("Relatório de Salários:\n");
        for (Empregado empregado : lista){
            empregado.exibirDetalhes();
            System.out.println("Tipo de empregado: " + empregado.tipoEmpregado());
            totalSalarios += empregado.calcularSalario();
            System.out.println(" ");
        }

        System.out.println("Total de salários a serem pagos pela empresa: " + totalSalarios);

    }
}