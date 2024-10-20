import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine(); 

        Consulta consulta = new Consulta();
        consulta.setNome(nome); //serve para passar o nome capturado no Main para o objeto consulta, que é uma instância da classe Consulta.

        System.out.println();
        System.out.println("-------Menu--------");
        System.out.println("1-Consultar conta");
        System.out.println("2-Depósito");
        System.out.println("3-Sacar");
        System.out.println("4-Sair");

        int operacao = sc.nextInt();


        if (operacao == 1) {
            consulta.consultarConta(); 
        }

        if (operacao == 2){
            consulta.depositar();
        }

        if (operacao == 4) {
            System.out.println("Saindo...");
        }

        sc.close();
    }
}
