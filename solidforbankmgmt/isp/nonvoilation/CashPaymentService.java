package solidforbankmgmt.isp.nonvoilation;

public class CashPaymentService {
    private CashPaymentProcessor paymentProcessor;//acepting actual base class

    public CashPaymentService(CashPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processCashPayment() {
        paymentProcessor.processCashPayment();
    }
}
