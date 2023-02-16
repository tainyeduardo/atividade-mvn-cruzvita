package br.com.cruzvita.entities;

public class Banco {
    private Conta conta;
    public void depositar(double quantidade){
        conta.setSaldo(quantidade + conta.getSaldo());
    }

    public void sacar (double quantidade){
        if (conta.getSaldo() > quantidade){
            conta.setSaldo(conta.getSaldo() - quantidade);
        }else{
            System.out.println("saldo insuficiente");
        }
    }

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
