package br.com.dio.aula_metodos;

import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hora;
        System.out.println("Digite a hora:");
        hora = scan.nextInt();
        if(hora >6 && hora <= 12 ){
            System.out.println("Bom Dia!");
        }else if(hora >12 && hora <=18){
            System.out.println("Boa Tarde!");
        }else{
            System.out.println("Boa Noite!");
        }


    }
}
