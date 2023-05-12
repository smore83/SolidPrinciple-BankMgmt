package solidforbankmgmt.isp.nonvoilation;

public class OnlinePayment implements OnlinePaymentProcessor, PaymentProcessor {
    //I required two interface method which i willl take
    public void processPayment() {
        System.out.println("Processing online payment...");
    }

    @Override
    public void processOnlinePayment() {
        System.out.println("Processing online payment...$402 cash payment");
    }
}
