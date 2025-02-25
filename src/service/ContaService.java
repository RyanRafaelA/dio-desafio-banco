package service;

import model.banco.Conta;
import model.banco.ContaCorrente;
import model.banco.ContaPoupancao;
import model.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ContaService {
    private List<Conta> listaConta;

    public ContaService(){
        listaConta = new ArrayList<>();
    }

    public void criarConta(char tipoConta, Cliente cliente, double saldoInicial){
        if (tipoConta == 'p') {
            listaConta.add(new ContaPoupancao(cliente, saldoInicial));
        } else if(tipoConta == 'c'){
            listaConta.add(new ContaCorrente(cliente, saldoInicial));
        }
    }

    public void mostraContasCadastradas(){
        listaConta.forEach(c -> System.out.println(c+"\n======================================="));
    }

    public Conta buscaConta(int numeroConta){
        Conta contaRetorno = null;

        for(Conta contas: listaConta){
            if(contas.getNumero() == numeroConta){
                contaRetorno = contas;
            }
        }

        return contaRetorno;
    }
}
