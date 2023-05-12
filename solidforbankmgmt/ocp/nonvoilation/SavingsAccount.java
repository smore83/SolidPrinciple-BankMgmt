package solidforbankmgmt.ocp.nonvoilation;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);//calling to accepting value in main class
        this.interestRate = interestRate;

    }

    public void deposit(double amount) {
        balance += amount;
        balance += (interestRate * amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
