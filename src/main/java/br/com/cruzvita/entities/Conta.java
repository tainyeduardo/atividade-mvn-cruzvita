package br.com.cruzvita.entities;

public class Conta {

    private long idConta;
    private double saldo;
    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getIdConta() {
        return idConta;
    }

    public void setIdConta(long idConta) {
        this.idConta = idConta;
    }

    public Conta(long idConta, double saldo, Cliente cliente) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return idConta + ", saldo: " + saldo + ", cliente => " + cliente;
    }
}
