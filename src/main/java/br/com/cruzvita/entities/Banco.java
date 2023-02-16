package br.com.cruzvita.entities;

import util.MetodosBank;

public class Banco implements MetodosBank {

    private Conta conta;

    @Override
    public void depositar(double quantidade){
        conta.setSaldo(quantidade + conta.getSaldo());
    }

    @Override
    public void sacar (double quantidade){
        if (conta.getSaldo() > quantidade){
            conta.setSaldo(conta.getSaldo() - quantidade);
        }else{
            System.out.println("saldo insuficiente");
        }
    }

    @Override
    public void transferir (double quantidade, Conta conta){
        if (this.conta.getSaldo() > quantidade){
            this.conta.setSaldo(this.conta.getSaldo() - quantidade);
            conta.setSaldo(conta.getSaldo() + quantidade);
        }

    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Banco(Conta conta) {
        this.conta = conta;
    }

}
