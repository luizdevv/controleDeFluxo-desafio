import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try {

            contar(primeiroParametro, segundoParametro);
        } catch (InputMismatchException e) {
            
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        scanner.close();
    }

    static void contar (int parametroUm, int parametroDois) throws InputMismatchException{
        if (parametroUm > parametroDois) {
            throw new InputMismatchException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}