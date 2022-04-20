package br.com.dio.exercicios_POO.Ex1;

import java.util.Date;

public class Pessoa {
    private String nome;
    private int nascimento;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Pessoa() {
        super();
    }

    public int calcularIdade() {
        return 2022 - getNascimento();
    }

    public String escreverNome() {
        return "Pessoa " + getNome() + " nascida no ano " + getNascimento() + " com a altura " + getAltura() + " tem "
                + calcularIdade() + " anos de idade";
    }
}
