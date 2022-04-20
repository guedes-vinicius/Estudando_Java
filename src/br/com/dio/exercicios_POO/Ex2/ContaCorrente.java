package br.com.dio.exercicios_POO.Ex2;

public class ContaCorrente {
    private int numeroConta;
    private String nome;
    private float saldo = 0;

    public ContaCorrente(){
        super();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome){
        this.nome = novoNome;
    }
    public void depositar(float valor){
        float deposito = getSaldo() + valor;
        this.saldo = deposito;
    }
    public void sacar(float saque){
        float novoSaque= getSaldo() - saque;
        this.saldo = novoSaque;
    }
    public String mostrarConta(){return getNome() + " tem " + getSaldo()+ " na conta.";}
}
