package solidforbankmgmt.srp.voilation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.....Add Balance");
        }
    }

    // This violates the Single Responsibility Principle so apply SRp
    public void printAccountInfo() { //additional code created
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("balance: " + balance);
    }
}
