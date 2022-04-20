package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero ");
        numero2 = scan.nextInt();
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 % numero2;


        System.out.println("O total da soma é " + soma);
        System.out.println("O total da subtração é " + subtracao);
        System.out.println("O total da multiplicação é " + multiplicacao);
        System.out.println("O total da divisao é " + divisao);
    }
}
