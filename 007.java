
import java.util.Scanner;

public class SomaDoisMaiores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = Math.max(a, Math.max(b, c));
              
        int segundoMaior;
        if (maior == a) {
            segundoMaior = Math.max(b, c);
        } else if (maior == b) {
            segundoMaior = Math.max(a, c);
        } else {
            segundoMaior = Math.max(a, b);
        }

        System.out.println("A soma dos dois maiores é: " + (maior + segundoMaior));
        sc.close();
    }
