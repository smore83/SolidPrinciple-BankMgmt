package solidforbankmgmt.lsp.voilation;

public class Voilation {
    public static void main(String[] args) {
        BankAccount account = new SavingAccount(1000, 2.5);
        account.withdraw(500);
        double balance = account.getBalance();
        System.out.println("Balance: " + balance);

        BankAccount account1 = new CheckingAccount(1000, 25);
        account1.withdraw(500); // Balance should be 475, but it remains 1000
        balance = account.getBalance();
        System.out.println("Balance: " + balance); // Output: Balance: 1000.0
    }

}
