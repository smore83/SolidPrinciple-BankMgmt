package solidforbankmgmt.dip.nonvoilation;

public class FreePayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing Free card payment of $" + amount);
    }
}
