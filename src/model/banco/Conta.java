package model.banco;

public abstract class Conta {
    private final static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
    }

    public int getAgencia(){ return agencia; }
    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        sacar(valor);
        contaDestino.depositar(valor);
    }
}
