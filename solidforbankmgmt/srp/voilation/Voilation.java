package solidforbankmgmt.srp.voilation;

public class Voilation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "Somnath More", 1000.0);
        account.printAccountInfo();
//        account.printAccountInfo();  bad practise
        account.deposit(500.0);
        account.printAccountInfo();
        account.withdraw(2000.0);
        account.printAccountInfo();
    }
}
