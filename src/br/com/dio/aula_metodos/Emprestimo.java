package br.com.dio.aula_metodos;

import br.com.dio.model.EmprestimoModel;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double emprestimo;
        int parcela;
        System.out.println("Digite o valor do emprestimo");
        emprestimo = scan.nextDouble();
        System.out.println("Digite a quantidade de parcelas para pagamento");
        parcela = scan.nextInt();

        EmprestimoModel calculaEmprestimo =  new EmprestimoModel(emprestimo, parcela);
        System.out.println("Valor total da parcela igual a: " + String.format("R$ %.2f", calculaEmprestimo.totalParcela()));





    }
}
