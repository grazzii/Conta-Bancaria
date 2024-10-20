import java.util.Scanner;

public class Consulta {
    private int valoremconta = 0;  // Valor atual na conta
    private String nome;  // Nome do usuário

    // Método para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para consultar a conta
    public void consultarConta() {
        System.out.println("Consultando conta bancária...");
        System.out.println("Nome: " + nome);  
        System.out.println("Você tem disponível: R$ " + valoremconta); 
    }


    public void depositar() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Quanto deseja depositar? ");
        int valordeposito = sc.nextInt();  

        if (valordeposito >= 1) {
            valoremconta += valordeposito;  
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + valoremconta);  
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    
}

