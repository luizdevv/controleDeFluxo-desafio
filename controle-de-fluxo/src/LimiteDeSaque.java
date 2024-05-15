import java.util.Scanner;

public class LimiteDeSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double iterador = 0;

        for (int i = 0; iterador < limiteDiario; i++) {
          
          double saque = scanner.nextDouble();
          
          if (saque == 0) {
            
            System.out.println("Transacoes encerradas.");
            break;
          } else if (saque < limiteDiario){
            
            iterador += saque;
            
            System.out.println("Saque realizado. Limite restante: " + (limiteDiario - iterador));
          } else {
            
            System.out.println("Limite diario de saque atingido. Transacoes encerradas");
            break;
          }
          
        }

// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}
