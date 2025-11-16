package Banking;

public abstract class Transaction<T> {
    abstract void processTransaction(T details);
    abstract void getTransactionHistory();
}
