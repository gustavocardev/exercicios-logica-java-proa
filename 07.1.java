
import java.util.Scanner;

public class SomaDoisMaioresUmaPassada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maior = Double.NEGATIVE_INFINITY;
        double segundoMaior = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            double x = sc.nextDouble();

            if (x > maior) {
                segundoMaior = maior;
                maior = x;
            } else if (x > segundoMaior) {
                segundoMaior = x;
            }
        }

        double soma = maior + segundoMaior;
        System.out.println("Soma dos dois maiores: " + soma);
        sc.close();
    }
}
``
