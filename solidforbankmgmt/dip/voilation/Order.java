package solidforbankmgmt.dip.voilation;

public class Order {
    private CashPayment cashPayment;//this is concreate class istance of concreate
    private CreditCardPayment creditCardPayment;////this is concreate class

    public Order() {
        this.cashPayment = new CashPayment();
        this.creditCardPayment = new CreditCardPayment();
    }

    public void processCashOrder(double amount) {
        cashPayment.processPayment(amount);
    }

    public void processCreditCardOrder(double amount) {
        creditCardPayment.processPayment(amount);
    }
}
