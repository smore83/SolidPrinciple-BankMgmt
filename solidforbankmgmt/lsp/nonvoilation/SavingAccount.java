package solidforbankmgmt.lsp.nonvoilation;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}
