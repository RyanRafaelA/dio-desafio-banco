package model.banco;

import model.cliente.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente novoCliente, double saldoInicial) {
        super(novoCliente, saldoInicial);
    }
}
