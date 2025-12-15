
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }

        System.out.println("\nValores informados:");
        for (double v : valores) {
            System.out.print(v + " ");
        }

        double media = soma / 10;
        System.out.println("\nMédia aritmética: " + media);

               sc.close();
    }
