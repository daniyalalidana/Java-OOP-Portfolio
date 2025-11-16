package Banking;
import java.time.LocalDate;

public abstract class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    protected double balance;
    LocalDate openingDate;
    boolean isActive;

    int noTransfer = 0;
    int noTransactions = 0;
    static final int transactionLimit = 6;

    BankAccount(String accountNumber, String accountHolderName, double balance, LocalDate openingDate )
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = openingDate;
        isActive = true;
    }

    abstract String getAccountType();

    void closeAccount()
    {
        isActive = false;
    }
    void getAccountSummary()
    {
        System.out.println("Account Holder Name: "+ accountHolderName+ ", Account Number: "+accountNumber+ ", Balance: "+ getBalance());
    }
    void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposit Sucessfull! ");
            noTransactions++;
        }
        else
        {
            System.out.println("Amount must be greater than zero ");
        }
    }

    void  withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("plz, Enter Valid amount! ");
            
        }
        else
        {
            balance -= amount;
            System.out.println("Successfully Withdraw! ");
            noTransactions++;
        }
    }

    double getBalance()
    {
        return balance;
    }

    String getAccountNumber()
    {
        return accountNumber;
    }

    public boolean transfer(BankAccount toAccount, double amount)
    {
        if (isTransferAllowed() && amount <= getBalance() && amount> 0)
        {
            balance -=amount;
            toAccount.balance += amount;
            noTransfer++;
            return true;
        }
        else
        {
            return false;
        }
    }

    public double getTransferLimit()
    {
        return 5000;
    }

    public boolean isTransferAllowed()
    {
        if (isActive == true && noTransfer < transactionLimit)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

}



