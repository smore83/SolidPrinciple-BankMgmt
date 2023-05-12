package solidforbankmgmt.isp.nonvoilation;

public class NonVoilation {
    public static void main(String[] args) {
        PaymentService onlinePaymentService = new PaymentService(new OnlinePayment());
        onlinePaymentService.processPayment();

        OnlinePaymentService onlinePaymentService2 = new OnlinePaymentService(new OnlinePayment());
        onlinePaymentService2.processOnlinePayment();

        PaymentService cashPaymentService = new PaymentService(new CashPayment());
        cashPaymentService.processPayment();

        CashPaymentService cashPaymentService2 = new CashPaymentService(new CashPayment());
        cashPaymentService2.processCashPayment();
    }
}
