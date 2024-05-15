import java.util.Scanner;

public class ChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 
        double conta = saldo - saque;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saque < saldo)
          System.out.println("Transacao realizada com sucesso.");
        else if (saque > saldo && conta < limiteChequeEspecial)
          System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        else
          System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}

