package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String nome;
        int salario;
        int totalVendas;
        double novoSalario;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do funcionario");
        nome = scan.next();
        System.out.println("Informe o salario fixo");
        salario = scan.nextInt();
        System.out.println("Infome o total de vendas em dinheiro");
        totalVendas = scan.nextInt();

        novoSalario = salario + (totalVendas * 0.15);
        System.out.println("O vendedor " + nome + " com salario fixo de " + salario + " terá o salário igual a "+ novoSalario);
    }
}
