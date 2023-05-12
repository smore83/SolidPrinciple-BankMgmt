package solidforbankmgmt.dip.nonvoilation;

public class NonVoilation{
    public static void main(String[] args) {
        PaymentMethod cashPayment = new CashPayment();
        PaymentMethod creditCardPayment = new CreditCardPayment();
       PaymentMethod freeOrderPayment=new FreePayment();
        Order cashOrder = new Order(cashPayment);
        cashOrder.processOrder(100.0);

        Order creditCardOrder = new Order(creditCardPayment);
        creditCardOrder.processOrder(200.0);
        Order freeOrder=new Order(freeOrderPayment);
        freeOrder.processOrder(500.0);
    }

}
