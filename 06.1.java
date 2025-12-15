
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();

        System.out.print("Digite o quarto valor: ");
        int valor4 = scanner.nextInt();

        int maior = valor1;

        if (valor2 > maior) {
                       maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }
        if (valor4 > maior) {
            maior = valor4;
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
