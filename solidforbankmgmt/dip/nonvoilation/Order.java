package solidforbankmgmt.dip.nonvoilation;

public class Order {
    private PaymentMethod paymentMethod;//cash method or credit method

    public Order(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    } //passed through contructor

    public void processOrder(double amount) {
        paymentMethod.processPayment(amount);
    }
}
