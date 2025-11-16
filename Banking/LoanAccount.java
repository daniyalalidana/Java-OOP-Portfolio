package Banking;

import java.time.LocalDate;

public class LoanAccount extends BankAccount implements InterestBearing {
    double principalAmount; 
    double outstandingBalance; 
    double interestRate = 0.12;
    int remainingTerm = 12;

    LoanAccount(String accountNumber, String accountHolderName, double balance, LocalDate openingDate) {
        super(accountNumber, accountHolderName, balance, LocalDate.now());
        isActive =true;
    }

    public double calculateAnnualInterest() {
        return outstandingBalance * interestRate;
    }

    public void applyInterest() {
        outstandingBalance += calculateAnnualInterest() / 12; // Monthly interest
    }

    void makePayment() {
        double emi = calculateEMI();
        double interestPortion = calculateAnnualInterest() / 12;
        double principalPortion = emi - interestPortion;

        outstandingBalance -= principalPortion;
        remainingTerm--;
    }

    public String getAccountType() {
        return "Loan Account";
    }

    double calculateEMI() {
        return (outstandingBalance * 0.01 * Math.pow(1 + 0.01, 12)) / (Math.pow(1 + 0.01, 12) - 1);

    }


    int getRemaingTerms() {
        return remainingTerm;
    }
}
