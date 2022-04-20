package br.com.dio.exercicios_POO.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int numeroConta;
        String nome;
        float saldoConta;

        ContaCorrente conta = new ContaCorrente();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        numeroConta = scan.nextInt();
        System.out.println("Digite o nome do usuario");
        nome = scan.next();
        System.out.println("Digite o valor da conta");
        saldoConta = scan.nextFloat();

        conta.setNumeroConta(numeroConta);
        conta.setNome(nome);
        conta.setSaldo(saldoConta);

        System.out.println(conta.mostrarConta());
        conta.alterarNome("Jose");
        conta.depositar(200);
        System.out.println(conta.mostrarConta());
        conta.sacar(20);
        System.out.println(conta.mostrarConta());
    }

}
