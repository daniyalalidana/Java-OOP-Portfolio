package Banking;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FixedDepositAccount extends BankAccount implements InterestBearing {
    int tenureMonths = 12;
    LocalDate maturityDate;
    double penaltyRate = 500;
    double interestrate =12 ;

    FixedDepositAccount (String accountNumber, String accountHolderName, double balance, LocalDate openingDate )
    {
        super(accountNumber, accountHolderName, balance, openingDate);
        isActive = true;
    }



    public double calculateAnnualInterest() {
        return (getBalance() * interestrate * 12) / 100;
    }

    public void applyInterest() {
        balance += calculateAnnualInterest();
    }

    double getMaturityAmount() {
        return balance;
    }

    void prematureWithdrawal(double amount)
    {
        if (amount <= balance)
        {
            LocalDate oneYearLater = openingDate.plusMonths(12);
            LocalDate today = LocalDate.now();

            int months = (int) ChronoUnit.MONTHS.between(openingDate, today);

            if (!today.isBefore(oneYearLater))
            {
                balance -=amount;
                System.out.println("withdraw sucessfull"); 
                
                
            }
            else
            {
                if ( months < 3)
                {
                    interestrate -=3;
                    balance -=penaltyRate;
                    balance -=amount;
                    System.out.println("You got Panalty of "+penaltyRate+"pkr, will be deducted from your account , \nInterest are reduced, current rate: "+interestrate+ ", \nRemaining balance: "+getBalance());
                }
                else if (months < 6) {
                    interestrate -=6;
                    balance -=penaltyRate;
                    balance -=amount;
                    System.out.println("You got Panalty of "+penaltyRate+"pkr, will be deducted from your account , \nInterest are reduced, current rate: "+interestrate+ ", \nRemaining balance: "+getBalance());

                }

                else if (months <9 ) {
                    interestrate -=9;
                    balance -=penaltyRate;
                    balance -=amount;
                    System.out.println("You got Panalty of "+penaltyRate+"pkr, will be deducted from your account , \nInterest are reduced, current rate: "+interestrate+ ", \nRemaining balance: "+getBalance());

                }
                else
                {
                    interestrate -= 10;
                    balance -=penaltyRate;
                    balance -=amount;
                    System.out.println("You got Panalty of "+penaltyRate+"pkr, due to early withdraw will be deducted from your account , \nInterest are reduced, current rate: "+interestrate+ ", \nRemaining balance: "+getBalance());
                }

                
            }
        }

        else
        {
            System.out.println("Not enough Balance in your account:");
        }
    }

    String getAccountType()
    {
        return"Fixed Deposit Account";
    }


}
