package solidforbankmgmt.ocp.nonvoilation;

public class NonVoilation {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456789", "Somnath More", 1000.00, 0.05);
        CurrentAccount currentAccount = new CurrentAccount("987654321", "Sachin Rakibe", 500.00, 1000.00);
      //If i want to create any service account then i can
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500.00);
        System.out.println("Savings Account Balance After Deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(200.00);
        System.out.println("Savings Account Balance After Withdrawal: " + savingsAccount.getBalance());

        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        currentAccount.deposit(200.00);
        System.out.println("Current Account Balance After Deposit: " + currentAccount.getBalance());
        currentAccount.withdraw(1000.00);
        System.out.println("Current Account Balance After Withdrawal: " + currentAccount.getBalance());
    }
}
