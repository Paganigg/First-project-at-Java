import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo de conta: ");
        String tipo = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("**************************");
        int opcao;
        
        do {
            System.out.println("MENU");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            System.out.println("**************************");

            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("**************************");
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    double saque = scanner.nextDouble();
                    saldo -= saque;
                    System.out.println("**************************");
                    break;
                case 3:
                    System.out.println("Saldo: " + saldo);
                    System.out.println("**************************");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.out.println("**************************");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("**************************");
            }

        } while (opcao != 4);
    }
}