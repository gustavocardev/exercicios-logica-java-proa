
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("Área do retângulo: " + area);
        sc.close();
    }
}


import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);
        sc.close();
    }
}


import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a diagonal maior: ");
        double dMaior = sc.nextDouble();
        System.out.print("Informe a diagonal menor: ");
        double dMenor = sc.nextDouble();
        double area = (dMaior * dMenor) / 2;
        System.out.println("Área do losango: " + area);
        sc.close();
    }
}


import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a base maior: ");
        double baseMaior = sc.nextDouble();
        System.out.print("Informe a base menor: ");
        double baseMenor = sc.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Área do trapézio: " + area);
        sc.close();
    }
}


import java.util.Scanner;

public class AreaParalelogramo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a base do paralelogramo: ");
        double base = sc.nextDouble();
        System.out.print("Informe a altura do paralelogramo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("Área do paralelogramo: " + area);
        sc.close();
    }
}


import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a base do triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Informe a altura do triângulo: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
        sc.close();
    }
}


import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + area);
        sc.close();
    }
}
