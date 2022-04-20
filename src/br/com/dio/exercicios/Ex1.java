package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int soma;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero ");
        numero2 = scan.nextInt();
        soma = numero1 + numero2;
        System.out.println("O total da soma é " + soma);
    }
}
