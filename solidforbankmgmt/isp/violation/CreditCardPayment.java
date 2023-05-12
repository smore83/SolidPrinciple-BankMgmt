package solidforbankmgmt.isp.violation;

public class CreditCardPayment implements PaymentProcessor {
    public void processPayment() {

        System.out.println("Lets assume only i required 3 methods");
    }

    public void refundPayment() {
        System.out.println("Lets assume only i reuired 3 methods");
    }

    public void validatePayment() {
        System.out.println("Lets assume only i reuired 3 methods");
    }

    public void authorizePayment() {
        System.out.println("Lets assume only i reuired 3 methods");
    }
}
