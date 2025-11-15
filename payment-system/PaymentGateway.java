abstract class PaymentGateway
{
    String gatewayName;
    PaymentGateway(String gatewayName)
    {
        this.gatewayName = gatewayName;

    }

    void connectGateway()
    {
        System.out.println("Connecting to: "+ gatewayName);
    }

}
