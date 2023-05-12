package solidforbankmgmt.isp.violation;

public class PaymentService {
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {

        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment() {
//        paymentProcessor.validatePayment();
//        paymentProcessor.authorizePayment();
        paymentProcessor.processPayment();
    }

    public void refundPayment() {

        paymentProcessor.refundPayment();
    }
}
