package solidforbankmgmt.isp.nonvoilation;

public class CashPayment implements CashPaymentProcessor, PaymentProcessor {
    //I required two interface method which i willl take
    public void processPayment() {
        System.out.println("Processing cash payment...");
    }

    @Override
    public void processCashPayment() {
        System.out.println("Processing cash payment...pay $400 cash");
    }
}
