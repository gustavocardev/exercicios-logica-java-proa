
import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System            System.out.println("O número informado é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número informado é NEGATIVO.");
        } else {
            System.out.println("O número informado é NEUTRO (zero).");
        }

        scanner.close();
    }
