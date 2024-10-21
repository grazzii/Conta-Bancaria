import java.util.Scanner;

public class Operadores {
    private int valoremconta = 0;
    private int valorsacado; 
    private int valorfinal;
    private String nome;  


    public void setNome(String nome) { //
        this.nome = nome;
    }


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
    public void sacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor a sacar: ");
        valorsacado = sc.nextInt();
            if(valorsacado >= valoremconta) {
                System.out.println("Valor indisponível");
            }
            else {
                System.out.println("Saque concluído para o valor: " + valorsacado + ".");
                int valorfinal = valoremconta - valorsacado;
                valoremconta = valorfinal;
                System.out.println("Valor final: " + valorfinal);
            }

    }
}

