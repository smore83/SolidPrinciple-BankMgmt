package solidforbankmgmt.dip.voilation;

import solidforbankmgmt.dip.voilation.CashPayment;
import solidforbankmgmt.dip.voilation.CreditCardPayment;

//class


public class Voilation {
    public static void main(String[] args) {
        Order order = new Order();
        order.processCashOrder(100.0);
        order.processCreditCardOrder(200.0);
    }

}








//class CreationAccount {
//    private Payment payment;
//
//    public CreationAccount() {
//        this.payment = new Payment(); // dip not followed because payment is subclass and calling in main class
//    }
//
//    public void processOrder() {
//       //calling to the charge method then it voilates
//        System.out.println("Going to the payment class in charge method");
//        payment.charge();
//    }
//}
//
//class Payment {
//    public void charge() {
//        System.out.println("I am charge method");
//    }
//}
//
//public class Voilation {
//    public static void main(String[] args) {
//        CreationAccount creationaccount = new CreationAccount();
//        creationaccount.processOrder();
//    }
//}
