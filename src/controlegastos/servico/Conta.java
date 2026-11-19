package controlegastos.servico;

import controlegastos.modelo.Imprimivel;

public class Conta implements Imprimivel {
    String titular;
    double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void imprimir() {
    }

}
