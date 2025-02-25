package service;

import model.cliente.Cliente;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    List<Cliente> listaCliente;

    public ClienteService(){
        listaCliente = new ArrayList<>();
    }

    public void criarCliente(String nome, String dataNascimento, String cpf, char sexo){
        try {
            listaCliente.add(new Cliente(nome, dataNascimento, cpf, sexo));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public Cliente retornaCliente(String nomeCliente){
        Cliente clienteRetorno = null;

        for(Cliente clientes: listaCliente){
            if(clientes.getNome().equalsIgnoreCase(nomeCliente)){
                clienteRetorno = clientes;
            }
        }

        return clienteRetorno;
    }
}
