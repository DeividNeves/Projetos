package controlegastos.servico;

import controlegastos.modelo.Imprimivel;

public class Conta implements Imprimivel {
    String titular;
    double saldo;

    public void imprimir() {
        System.out.println("Pimpim");
    }
}
