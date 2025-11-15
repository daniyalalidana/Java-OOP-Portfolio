
public class Main{

    public static void main(String[] args) {
        CreditCardGateway creditcrd  = new CreditCardGateway("Cradit Card");
        creditcrd.connectGateway();
        creditcrd.validatePayment();
        creditcrd.processPayment(1000);
        creditcrd.cancelPayment();
        
    }
}