import model.banco.Conta;
import service.ClienteService;
import service.ContaService;

import java.util.Scanner;

public class Main {
    static ClienteService cl = new ClienteService();
    static ContaService co = new ContaService();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Conta conta;

        int opcao = 1, numeroBancoEnviar;
        double valor;

        bancoDeDadosNaMemoria();

        cl.criarCliente("Ryan Rafael", "17/06/2001", "2758907", 'm');
        co.criarConta('p', cl.retornaCliente("Ryan Rafael"), 900);

        conta = co.buscaConta(5);

        while(opcao!=6){
            System.out.println("===========================================");
            menu();
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("R$ ");
                    valor = sc.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.print("R$ ");
                    valor = sc.nextDouble();
                    conta.sacar(valor);
                    break;
                case 3:
                    co.mostraContasCadastradas();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Numero para transferir: ");
                    numeroBancoEnviar = sc.nextInt();
                    System.out.print("R$ ");
                    valor = sc.nextDouble();
                    conta.transferir(valor, co.buscaConta(numeroBancoEnviar));
                    break;
                case 5:
                    conta.mostrarExtrato();
                    break;
                case 6:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção errada!");
            }
        }
    }

    public static void bancoDeDadosNaMemoria()  {
        cl.criarCliente("Leonardo", "21/07/1976", "96745754", 'm');
        cl.criarCliente("Fernanda", "01/01/1981", "6857866", 'f');
        cl.criarCliente("Ruan", "18/10/2007", "9664779",'m');
        cl.criarCliente("Joana", "09/12/2001", "0876900", 'f');

        co.criarConta('p', cl.retornaCliente("ruan"), 1800);
        co.criarConta('c', cl.retornaCliente("leonardo"), 2590.50);
        co.criarConta('c', cl.retornaCliente("fernanda"), 3050.90);
        co.criarConta('p', cl.retornaCliente("joana"), 1205);
    }

    public static void menu(){
        System.out.print("[1] - Depositar\n[2] - Sacar\n[3] - Clientes do banco\n[4] - Transferir\n[5] - Ver Extrato\n[6] - sair" +
                "\nDigite a opção");
    }
}