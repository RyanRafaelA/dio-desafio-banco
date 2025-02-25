import model.banco.Conta;
import model.banco.ContaCorrente;
import model.banco.ContaPoupancao;
import model.cliente.Cliente;
import service.ClienteService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        bancoDeDadosNaMemoria();
    }

    public static void bancoDeDadosNaMemoria()  {
        ClienteService cl = new ClienteService();

        cl.criarCliente("Leonardo", "21/07/1976", "96745754", 'm');
        cl.criarCliente("Fernanda", "01/01/1981", "6857866", 'f');
        cl.criarCliente("Ruan", "18/10/2007", "9664779",'m');
        cl.criarCliente("Joana", "09/12/2001", "0876900", 'f');

        List<Conta> listaContas = new ArrayList<>();

        listaContas.add(new ContaPoupancao(cl.retornaCliente("ruan"), 1800));
        listaContas.add(new ContaCorrente(cl.retornaCliente("leonardo"), 2590.50));
        listaContas.add(new ContaCorrente(cl.retornaCliente("fernanda"), 3050.90));
        listaContas.add(new ContaPoupancao(cl.retornaCliente("joana"), 1205));
    }

    public static void menu(){
        System.out.println("");
    }
}