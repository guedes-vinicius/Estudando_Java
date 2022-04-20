package br.com.dio.aula_metodos;

import java.util.Scanner;

public class CalculadoraMetodo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digiteo segundo valor: ");
        b = scan.nextDouble();

        double somar = Somar(a, b);
        double subtrair = Subtrair(a, b);
        double multiplicar = Multiplicar(a, b);
        double dividir = Dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);


    }
    public static double Somar (double a, double b){
        return a + b;
    }
    public static double Subtrair(double a, double b){
        return a - b;
    }
    public static double Multiplicar(double a, double b){
        return a * b;
    }
    public static double Dividir(double a, double b){
        return a / b;
    }
}
