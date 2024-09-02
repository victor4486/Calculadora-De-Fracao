import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Calculadora de frações, qual opção deseja utilizar?");
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n0 - Sair do programa ");
            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 4){
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }

            switch (opcao){
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                case 1:
                    Calculadora.Somar();
                    break;
                case 2:
                    Calculadora.Subtrair();
                    break;
                case 3:
                    Calculadora.Multiplicar();
                    break;
                case 4:
                    Calculadora.Dividir();
                    break;
            }

        } while (opcao != 0);
    }
}
