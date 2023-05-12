package solidforbankmgmt.dip.nonvoilation;

public class CashPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}
