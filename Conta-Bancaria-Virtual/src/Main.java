import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("Clark Kent", "Corrente", 1599.99);
        account.displayAccountInfo();

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                """;

        int option = 0;

        while (option != 4) {
            System.out.println(menu);
            System.out.print("Opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> account.checkBalance();
                case 2 -> {
                    System.out.print("Qual o valor que deseja transferir? ");
                    double amount = scanner.nextDouble();
                    account.transferAmount(amount);
                }
                case 3 -> {
                    System.out.print("Valor recebido: ");
                    double amount = scanner.nextDouble();
                    account.receiveAmount(amount);
                }
                case 4 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}