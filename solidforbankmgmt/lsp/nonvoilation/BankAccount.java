package solidforbankmgmt.lsp.nonvoilation;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void chargeFee() {
        // do nothing - this method is overridden in CheckingAccount
    }
}
