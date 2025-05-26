public class BankAccount {
    private String ownerName;
    private String accountType;
    private double balance;

    public BankAccount(String ownerName, String accountType, double balance) {
        this.ownerName = ownerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + ownerName);
        System.out.println("Tipo conta: " + accountType);
        System.out.println("Saldo atual: " + balance);
        System.out.println("\n***********************");
    }

    public void checkBalance() {
        System.out.println("O saldo atualizado é: " + balance);
    }

    public void transferAmount(double amount) {
        if (amount > balance) {
            System.out.println("Não há saldo para realizar a transferência.");
        } else {
            balance -= amount;
            System.out.println("Transferência realizada.");
            System.out.println("Novo saldo: " + balance);
        }
    }

    public void receiveAmount(double amount) {
        balance += amount;
        System.out.println("Valor recebido com sucesso.");
        System.out.println("Novo saldo: " + balance);
    }
}
