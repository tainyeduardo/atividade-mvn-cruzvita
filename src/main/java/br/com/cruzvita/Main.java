package br.com.cruzvita;

import br.com.cruzvita.entities.Banco;
import br.com.cruzvita.entities.Cliente;
import br.com.cruzvita.entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Tainy", "123.456.789-10", "04/10/2002");
        Cliente cliente2 = new Cliente("Nathan", "987.654.321-09", "16/10/2003");
        Conta conta1 = new Conta(1, 500, cliente1);
        Conta conta2 = new Conta(2, 95, cliente2);
        Banco banco1 = new Banco(conta1);
        Banco banco2 = new Banco(conta2);

        System.out.println("VITA BANK");
        System.out.println("[1] Conta 1");
        System.out.println("[2] Conta 2");
        System.out.println("================");
        int selecao = sc.nextInt();

        switch (selecao) {
            case 1:
                System.out.println("SELECIONADO: " + conta1);
                System.out.println("[1] DEPOSITAR");
                System.out.println("[2] SACAR");
                System.out.println("[3] TRANSFERIR");
                System.out.println("================");
                System.out.print("Selecione a operação: ");
                int operacao = sc.nextInt();

                switch (operacao) {
                    case 1:
                        System.out.println("qual valor deseja depositar? ");
                        double deposito = sc.nextDouble();
                        banco1.depositar(deposito);
                        System.out.println("saldo atual: R$" + conta1.getSaldo());
                        break;

                    case 2:
                        System.out.println("qual valor deseja sacar? ");
                        double saque = sc.nextDouble();
                        banco1.sacar(saque);
                        System.out.println("saldo atual: R$" + conta1.getSaldo());
                        break;

                    case 3:
                        System.out.println("qual valor deseja transferir? ");
                        double transferir = sc.nextDouble();
                        banco1.transferir(transferir, conta2);
                        System.out.println("saldo atualizado conta 1: R$" + conta1.getSaldo());
                        System.out.println("saldo atualizado conta 2: R$" + conta2.getSaldo());
                        break;
                    default:
                        break;
                }
                break;


            case 2:
                System.out.println("SELECIONADO: " + conta2);
                System.out.println("[1] DEPOSITAR");
                System.out.println("[2] SACAR");
                System.out.println("[3] TRANSFERIR");
                System.out.println("================");
                System.out.print("Selecione a operação: ");
                int operacao2 = sc.nextInt();

                switch (operacao2) {
                    case 1:
                        System.out.println("qual valor deseja depositar? ");
                        double deposito = sc.nextDouble();
                        banco2.depositar(deposito);
                        System.out.println("saldo atual: R$" + conta2.getSaldo());
                        break;

                    case 2:
                        System.out.println("qual valor deseja sacar? ");
                        double saque = sc.nextDouble();
                        banco2.sacar(saque);
                        System.out.println("saldo atual: R$" + conta2.getSaldo());
                        break;

                    case 3:
                        System.out.println("qual valor deseja transferir? ");
                        double transferir = sc.nextDouble();
                        banco2.transferir(transferir, conta1);
                        System.out.println("saldo atualizado conta 1: R$" + conta2.getSaldo());
                        System.out.println("saldo atualizado conta 2: R$" + conta1.getSaldo());
                        break;

                    default:
                        break;

                }


        }
    }
}