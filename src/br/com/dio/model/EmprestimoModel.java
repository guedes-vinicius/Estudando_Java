package br.com.dio.model;

public class EmprestimoModel {
    private double valor;
    private int parcelas;

    public EmprestimoModel(double valor, int parcelas) {
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public  double totalParcela() {
        double calculo = (this.valor / this.parcelas) + (3 * this.parcelas);
        return calculo;
    }
}
