package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String nome;
        int nota1;
        int nota2;
        int nota3;
        int media;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        nome = scan.next();
        System.out.println("Digite a primeira a nota");
        nota1 = scan.nextInt();
        System.out.println("Digite a segunda a nota");
        nota2 = scan.nextInt();
        System.out.println("Digite a terceira a nota");
        nota3 = scan.nextInt();

        media = (nota1+nota2+nota3)/3;

        System.out.println("O aluno " + nome + " ficou com média " + media);


    }
}
