package model.banco;

import model.cliente.Cliente;

public class ContaPoupancao extends Conta{
    public ContaPoupancao(Cliente novoCliente, double saldoInicial) {
        super(novoCliente, saldoInicial);
    }
}
