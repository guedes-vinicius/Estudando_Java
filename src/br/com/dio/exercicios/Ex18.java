package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int contador;
        int idade;
        contador = 0;
        Scanner scan = new Scanner(System.in);
        while (contador < 10){
            idade = scan.nextInt();
            if (idade >= 18){
                System.out.println("Maior de idade");
                contador+=1;
            }else {
                System.out.println("Menor de idade");
                contador+=1;
            }
        }
    }
}
