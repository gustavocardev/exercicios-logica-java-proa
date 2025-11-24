
import java.util.Scanner;

public class SaudacaoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        // Solicita a idade do usuário
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        // Exibe a mensagem personalizada
        System.out.println("Olá, " + nome + ", sua idade é " + idade);

    }
}
