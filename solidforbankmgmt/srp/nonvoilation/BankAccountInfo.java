package solidforbankmgmt.srp.nonvoilation;

public class BankAccountInfo {
    public void printAccountInfo(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());
    }
}
