import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        
        while (true) {

            int opcao = scanner.nextInt();
            
            if (opcao == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            switch (opcao) {
                case 1:
                    int numDeposito = scanner.nextInt();

                    saldo +=  numDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    int numSaque = scanner.nextInt();
                    
                    if (numSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    }

                    saldo -= numSaque;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");;
            }
        }

        scanner.close();
    }
}