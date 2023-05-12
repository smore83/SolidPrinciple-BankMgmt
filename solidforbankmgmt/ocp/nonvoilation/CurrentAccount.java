package solidforbankmgmt.ocp.nonvoilation;

public class CurrentAccount extends BankAccount {
    private double x;///make extra over draft limit

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.x = x;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if ((balance + x) >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
