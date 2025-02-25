import model.banco.Conta;
import model.banco.ContaCorrente;
import model.banco.ContaPoupancao;
import model.cliente.Cliente;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        try {
            bancoDeDadosNaMemoria();


        } catch (ParseException p){
            System.out.println("Falha na formatação de data de nascimento. ");
        }
    }

    public static void bancoDeDadosNaMemoria() throws ParseException {
        Cliente leonardo = new Cliente("Leonardo", "21/07/1976", "96745754", 'm');
        Cliente fernanda = new Cliente("Fernanda", "01/01/1981", "6857866", 'f');
        Cliente ruan = new Cliente("Ruan", "18/10/2007", "9664779",'m');
        Cliente joana = new Cliente("Joana", "09/12/2001", "0876900", 'f');

        List<Conta> listaContas = new ArrayList<>();

        listaContas.add(new ContaPoupancao(ruan, 1800));
        listaContas.add(new ContaCorrente(leonardo, 2590.50));
        listaContas.add(new ContaCorrente(fernanda, 3050.90));
        listaContas.add(new ContaPoupancao(joana, 1205));
    }

    public static void menu(){
        System.out.println("");
    }
}