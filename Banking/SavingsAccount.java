package Banking;
import java.time.LocalDate;

public class SavingsAccount extends BankAccount implements InterestBearing {
    private double minimumBalance = 400.0;
    private double interestRate = 0.04; 
    SavingsAccount(String accountNumber, String accountHolderName, double balance, LocalDate openingDate)
    {
        super(accountNumber, accountHolderName, balance, LocalDate.now());
        isActive = true;
    }

    public double calculateAnnualInterest()
    {
        return (getBalance() * interestRate);
    }

    public String getAccountType()
    {
        return "Saving Account";
    }

    public void applyInterest()
    {
        balance += calculateAnnualInterest();
    }

    void checkMinimumBalance()
    {
        if ( getBalance() < minimumBalance )
        {
            System.out.println("Account Balance are Low Plz add funds Asap!");
        }
        else
        {
            System.out.println("Everything are Okay!");
        }
    }

    
}
