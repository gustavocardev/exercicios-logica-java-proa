
import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaSemestreComValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0.0;

        for (int i = 1; i <= 4; i++) {
            double nota = lerNotaValida(sc, "Informe a " + i + "ª nota (0 a 10): ");
            soma += nota;
        }

        double media = soma / 4.0;
        System.out.printf("Média do semestre: %.2f%n", media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }

        sc.close();
    }

    private static double lerNotaValida(Scanner sc, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                double n = sc.nextDouble();
                if (n >= 0.0 && n <= 10.0) {
                    return n;
                }
                System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número (use ponto para decimais).");
                sc.next(); // descarta o token inválido
            }
        }
    }
}
