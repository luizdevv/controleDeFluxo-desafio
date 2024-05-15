import java.util.Scanner;

public class VerificadorNumeroConta {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        try {
            
            String numeroConta = scanner.nextLine();
            
            verificarNumeroConta(numeroConta);
        } catch (IllegalArgumentException e) {
            
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } finally {
            
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String num) throws IllegalArgumentException {
        
        if (num.length() != 8)
            throw new IllegalArgumentException();
        else
            System.out.println("Numero de conta valido.");
    }
}
