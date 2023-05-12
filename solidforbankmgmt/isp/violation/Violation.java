package solidforbankmgmt.isp.violation;


public class Violation {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment();
        paymentService.refundPayment();


        System.out.println("Hello");
        paymentService = new PaymentService(new BankTransferPayment());
        paymentService.processPayment();
        paymentService.refundPayment();
    }
}
