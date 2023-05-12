package solidforbankmgmt.lsp.voilation;

public class CheckingAccount extends BankAccount {
    private double fee;

    public CheckingAccount(double balance, double fee) {
        super(balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void chargeFee() {
        withdraw(fee);  //i have defined withdraw method but it is not executing
    }
}
