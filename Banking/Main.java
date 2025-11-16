package Banking;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(" DAD Bank System - OOP Demo\n");
        
        // create banks
        Bank dadBank = new Bank();
        
        //  customers
        Customer customer1 = new Customer("Ali Khan", "ali@email.com", 123456789);
        Customer customer2 = new Customer("Sara Ahmed", "sara@email.com", 987654321);
        
        //add customers to bank
        dadBank.addCustomer(customer1);
        dadBank.addCustomer(customer2);
        
        System.out.println("=== CUSTOMER REGISTRATION ===");
        customer1.getCustomerInfo();
        customer2.getCustomerInfo();
        
        //create different account types
        SavingsAccount savings = new SavingsAccount("SAV001", "Ali Khan", 5000, LocalDate.now());
        CurrentAccount current = new CurrentAccount("CUR001", "Ali Khan", 10000, LocalDate.now());
        FixedDepositAccount fd = new FixedDepositAccount("FD001", "Sara Ahmed", 20000, LocalDate.now());
        LoanAccount loan = new LoanAccount("LN001", "Sara Ahmed", 50000, LocalDate.now());
        
        // Open accounts for customers
        dadBank.openAccount(customer1, savings);
        dadBank.openAccount(customer1, current);
        dadBank.openAccount(customer2, fd);
        dadBank.openAccount(customer2, loan);
        
        System.out.println("\n=== ACCOUNT OPERATIONS ===");
        
        // Savings Account Demo
        System.out.println("\n Savings Account Demo:");
        savings.getAccountSummary();
        savings.deposit(1000);
        savings.withdraw(500);
        savings.checkMinimumBalance();
        System.out.println("Annual Interest: " + savings.calculateAnnualInterest());
        
        // Current Account Demo  
        System.out.println("\n Current Account Demo:");
        current.getAccountSummary();
        current.checkOverdraft();
        current.processCheque("CUR001", 2000);
        
        // Fixed Deposit Demo
        System.out.println("\n Fixed Deposit Demo:");
        fd.getAccountSummary();
        System.out.println("Maturity Amount: " + fd.getMaturityAmount());
        fd.prematureWithdrawal(5000);
        
        // Loan Account Demo
        System.out.println("\n Loan Account Demo:");
        loan.getAccountSummary();
        System.out.println("Annual Interest: " + loan.calculateAnnualInterest());
        loan.makePayment();
        System.out.println("Remaining Terms: " + loan.getRemaingTerms());
        
        // Transfer Demo
        System.out.println("\n Transfer Demo:");
        boolean transferSuccess = savings.transfer(current, 1000);
        System.out.println("Transfer successful: " + transferSuccess);
        savings.getAccountSummary();
        current.getAccountSummary();
        
        // Account Manager Demo
        System.out.println("\n Account Manager Demo:");
        AccountManager<BankAccount> manager = new AccountManager<>();
        manager.addAccount(savings);
        manager.addAccount(current);
        manager.addAccount(fd);
        
        System.out.println("Total Balance in Manager: " + manager.getTotalBalance());
        System.out.println("Finding account SAV001:");
        manager.findAccount("SAV001");
        
        // Bank Summary
        System.out.println("\n Bank Summary:");
        dadBank.getBankSummary();
        
        System.out.println("\n Demo Completed Successfully!");
    }
}