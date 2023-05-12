package solidforbankmgmt.srp.nonvoilation;

public class NonVoilation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("891234567", "Somnath More", 1000);

//        account.deposit(500.0);
//        account.withdraw(2000.0);

        BankAccountInfo printer = new BankAccountInfo();
        printer.printAccountInfo(account);
    }
}
