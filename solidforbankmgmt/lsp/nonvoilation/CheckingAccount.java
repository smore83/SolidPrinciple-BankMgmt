package solidforbankmgmt.lsp.nonvoilation;

public class CheckingAccount extends BankAccount {
    private double minimumBalance;

    public CheckingAccount(double balance, double minimumBalance) {
        super(balance);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void chargeFee() {
        if (getBalance() < minimumBalance) {
            double fee = 10.0;
            withdraw(fee);
        }
    }
}
