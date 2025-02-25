package model.banco;

import model.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private final static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    protected double saldo;
    private Cliente cliente;
    private List<String> extratoBancario;

    public Conta(Cliente novoCliente, double saldoInicial){
        this.cliente = novoCliente;
        this.saldo = saldoInicial;
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;

        extratoBancario = new ArrayList<>();
    }

    public int getAgencia(){ return agencia; }
    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public void sacar(double valor) {
        saldo -= valor;
        registrarExtratoBancario("Sacou R$"+String.format("%.2f",valor));
    }

    public void depositar(double valor){
        saldo += valor;
        registrarExtratoBancario("Depositou R$"+String.format("%.2f",valor));
    }

    public void transferir(double valor, Conta contaDestino){
        sacar(valor);
        contaDestino.depositar(valor);
        registrarExtratoBancario("tranferio para conta "+contaDestino.getNumero()+" R$"+String.format("%.2f",valor));
    }

    private void registrarExtratoBancario(String registro){
        extratoBancario.add(registro);
    }

    public void mostrarExtrato(){
        System.out.println("===========================================");
        extratoBancario.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Titula: "+cliente.getNome()
                +"\nAgencia: "+getAgencia()
                +"\nNumero Conta: "+getNumero()
                +"\nSaldo: "+String.format("%.2f", getSaldo());
    }
}
