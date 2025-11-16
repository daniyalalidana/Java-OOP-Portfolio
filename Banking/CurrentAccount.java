package Banking;

import java.time.LocalDate;

public class CurrentAccount extends BankAccount  {
    double overdraftLimit = -1000;
    int transactionLimit = 5;

    CurrentAccount(String accountNumber, String accountHolderName, double balance, LocalDate openingDate) {
        super(accountNumber, accountHolderName, balance, openingDate);
        isActive = true;
    }

    String getAccountType()
    {
        return "Current Account";
    }

    void checkOverdraft()
    {
        if(overdraftLimit > balance)
        {
            System.out.println("Limits Hit!,  adds faund your current account");
        }
        else
        {
            System.out.println("Not hit yet!");
        }
        
    }
    void processCheque(String accNo, double amount)
    {
        if(accNo == getAccountNumber() )
        {
            if (amount <= balance)
            {
                System.out.println("Payment Done!");
                balance -= amount;
            }
            else{
                System.out.println("You are not enough blc to withdraw!");
            }
        }
        else
        {
            System.out.println("Your account no are wrong!");
        }
    }
}