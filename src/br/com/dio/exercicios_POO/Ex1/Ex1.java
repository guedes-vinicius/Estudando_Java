package br.com.dio.exercicios_POO.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String nomePessoa;
        int nascimentoPessoa;
        float alturaPessoa;

        Pessoa pessoa = new Pessoa();

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome da pessoa");
        nomePessoa = scan.next();
        System.out.println("Ano nascimento");
        nascimentoPessoa = scan.nextInt();
        System.out.println("Altura");
        alturaPessoa = scan.nextFloat();

        pessoa.setNome(nomePessoa);
        pessoa.setAltura(alturaPessoa);
        pessoa.setNascimento(nascimentoPessoa);

        System.out.println(pessoa.escreverNome());

    }

}
