class CreditCardGateway extends PaymentGateway implements Transaction
{
    CreditCardGateway(String gatewayName)
    {
        super(gatewayName);
    }
    void validatePayment()
    {
        System.out.println("Validating credit card details");
    }
    public void processPayment(double amount)
    {
        System.out.println("Processing credit card payment of "+amount);
    }
}