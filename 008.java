
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoInteirosComValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = lerInt(sc, "Informe o primeiro valor inteiro (a): ");

        int b;
        while (true) {
            b = lerInt(sc, "Informe o segundo valor inteiro (b) (precisa ser > 0): ");
            if (b > 0) {
                break;
            }
            System.out.println("Valor inválido para o segundo número. Ele deve ser estritamente positivo (> 0). Tente novamente.");
        }

        // Para mostrar divisão real, converta para double
        double resultado = (double) a / b;
        System.out.println("Resultado da divisão a / b = " + resultado);

        sc.close();
    }

    private static int lerInt(Scanner sc, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro válido.");
                sc.next(); // descarta o token inválido
            }
        }
    }
}
