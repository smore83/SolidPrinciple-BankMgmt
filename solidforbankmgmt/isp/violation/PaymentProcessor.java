package solidforbankmgmt.isp.violation;

public interface PaymentProcessor {   //if you create this interface then you need to implement all four methods in implements class
    void processPayment();

    void refundPayment();

    void validatePayment();

    void authorizePayment();
}
