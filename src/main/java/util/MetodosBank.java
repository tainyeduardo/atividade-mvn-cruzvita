package util;

import br.com.cruzvita.entities.Conta;

public interface MetodosBank {

    void depositar(double quantidade);

    void sacar(double quantidade);

    void transferir (double quantidade, Conta conta);
}
