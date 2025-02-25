import service.ClienteService;
import service.ContaService;

public class Main {
    public static void main(String[] args){
        bancoDeDadosNaMemoria();
    }

    public static void bancoDeDadosNaMemoria()  {
        ClienteService cl = new ClienteService();
        ContaService co = new ContaService();

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
        System.out.println("");
    }
}