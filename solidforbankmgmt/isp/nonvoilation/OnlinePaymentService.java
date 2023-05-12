package solidforbankmgmt.isp.nonvoilation;

public class OnlinePaymentService {
    private OnlinePaymentProcessor paymentProcessor;

    public OnlinePaymentService(OnlinePaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOnlinePayment() {
        paymentProcessor.processOnlinePayment();
    }
}
