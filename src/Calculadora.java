import java.util.Scanner;

public class Calculadora {

    public static void Somar() {
        Scanner scanner = new Scanner(System.in);

        int numeradorUm;
        int denominadorUm;
        int numeradorDois;
        int denominadorDois;

        System.out.println("Digite a primeira fração, sempre o numerador e depois o denominador:");
        numeradorUm = scanner.nextInt();
        denominadorUm = scanner.nextInt();
        System.out.println("Digite a segunda fração, sempre o numerador e depois o denominador:");
        numeradorDois = scanner.nextInt();
        denominadorDois = scanner.nextInt();

        if (denominadorUm == denominadorDois) {
            int resultado = numeradorUm + numeradorDois;
            System.out.println("O resultado é " + resultado + "/" + denominadorDois);
        } else {
            int resultadoUm = denominadorDois * numeradorUm;
            int resultadoDois = denominadorUm * numeradorDois;
            int resultadoNumerador = resultadoUm + resultadoDois;
            int resultadoDenominador = denominadorUm * denominadorDois;
            System.out.println("O resultado é " + resultadoNumerador + "/" + resultadoDenominador);
        }
    }

    public static void Subtrair() {
        Scanner scanner = new Scanner(System.in);

        int numeradorUm;
        int denominadorUm;
        int numeradorDois;
        int denominadorDois;

        System.out.println("Digite a primeira fração, sempre o numerador e depois o denominador:");
        numeradorUm = scanner.nextInt();
        denominadorUm = scanner.nextInt();
        System.out.println("Digite a segunda fração, sempre o numerador e depois o denominador:");
        numeradorDois = scanner.nextInt();
        denominadorDois = scanner.nextInt();

        if (denominadorUm == denominadorDois) {
            int resultado = numeradorUm - numeradorDois;
            System.out.println("O resultado é " + resultado + "/" + denominadorDois);
        } else {
            int resultadoUm = denominadorDois * numeradorUm;
            int resultadoDois = denominadorUm * numeradorDois;
            int resultadoNumerador = resultadoUm - resultadoDois;
            int resultadoDenominador = denominadorUm * denominadorDois;
            System.out.println("O resultado é " + resultadoNumerador + "/" + resultadoDenominador);
        }
    }

    public static void Multiplicar(){
        Scanner scanner = new Scanner(System.in);

        int numeradorUm;
        int denominadorUm;
        int numeradorDois;
        int denominadorDois;

        System.out.println("Digite a primeira fração, sempre o numerador e depois o denominador:");
        numeradorUm = scanner.nextInt();
        denominadorUm = scanner.nextInt();
        System.out.println("Digite a segunda fração, sempre o numerador e depois o denominador:");
        numeradorDois = scanner.nextInt();
        denominadorDois = scanner.nextInt();

        int resultadoUm = numeradorUm * numeradorDois;
        int resultadoDois = denominadorUm * denominadorDois;

        System.out.println("O resultado é " + resultadoUm + "/" + resultadoDois);
    }

    public static void Dividir(){
        Scanner scanner = new Scanner(System.in);

        int numeradorUm;
        int denominadorUm;
        int numeradorDois;
        int denominadorDois;
        int armanezamentoVariavel;

        System.out.println("Digite a primeira fração, sempre o numerador e depois o denominador:");
        numeradorUm = scanner.nextInt();
        denominadorUm = scanner.nextInt();
        System.out.println("Digite a segunda fração, sempre o numerador e depois o denominador:");
        numeradorDois = scanner.nextInt();
        denominadorDois = scanner.nextInt();

        // Para dividir, devemos multiplicar pelo inverso da segunda:

        armanezamentoVariavel = numeradorDois; // segura o valor antigo do numeradorDois
        numeradorDois = denominadorDois;
        denominadorDois = armanezamentoVariavel;

        int resultadoUm = numeradorUm * numeradorDois;
        int resultadoDois = denominadorUm * denominadorDois;

        System.out.println("O resultado é " + resultadoUm + "/" + resultadoDois);
    }
}
