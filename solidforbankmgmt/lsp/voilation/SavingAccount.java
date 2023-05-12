package solidforbankmgmt.lsp.voilation;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);///set balance to parent side
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    //     This violates the Liskov substitution principle.
    //if we creating additionaly if i wrote then i will be problemo
    public void withdraw(double amount) {  //code which additionaly
        // Do nothing
        System.out.println("I am violating calling here only not going in bank Acc class");
    }
//    public rateinter
}
