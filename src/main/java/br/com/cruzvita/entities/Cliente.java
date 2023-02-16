package br.com.cruzvita.entities;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cliente(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", cpf= " + cpf +
                ", data de nascimento: " + dataNascimento;
    }
}
