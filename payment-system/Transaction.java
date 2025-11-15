interface Transaction
{
    abstract void processPayment(double amount);
    public default void cancelPayment()
    {
        System.out.println("Transaction cancelled");
    }
}