package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int distancia;
        int combustivel;
        double ConsumoMedio;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a distância percorrida");
        distancia = scan.nextInt();
        System.out.println("Descreva o combustivel gasto");
        combustivel = scan.nextInt();

        ConsumoMedio = distancia/combustivel;
        System.out.println("Total percorrido foi de " + ConsumoMedio + "Km");



    }
}
