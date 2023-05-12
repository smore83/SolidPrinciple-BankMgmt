package solidforbankmgmt.isp.violation;

public class BankTransferPayment implements PaymentProcessor {
    //I have to write extra four method each time any solution
    public void processPayment() {
        System.out.println("Lets assume only i required 1 methods");
    }

    public void refundPayment() {
        System.out.println("Lets assume only i required 1 methods then this other four method why should implemnt");
    }

    public void validatePayment() {
        System.out.println("Lets assume only i required 1 methods then this other four method why should implemnt");
    }

    public void authorizePayment() {
        System.out.println("Lets assume only i required 1 methods then this other four method why should implemnt");
    }
}
