package Banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    static int counter = 1;
    int customerId;
    private String name;
    private String email;
    private int phoneNumber;
    List<BankAccount> accounts;

    Customer(){}
    Customer(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.customerId = counter++;
        this.accounts = new ArrayList<>();
    }

    void addAccount(BankAccount account)
    {
        accounts.add(account);
    }

    void getAllAccounts()
    {
        for(BankAccount account: accounts)
        {
            account.getAccountSummary();
        }
    }

    double getTotalBalance()
    {
        double totalbalance = 0;
        for (BankAccount account : accounts)
        {
            totalbalance += account.getBalance();
        }
        return totalbalance;
    }

    void getCustomerInfo()
    {
        System.out.println("Name: "+ name+ ", Email: "+ email+", Contact Number: "+phoneNumber+ ", Customer ID: "+customerId);
    }

    int getCustomerId()
    {
        return customerId;
    }

}
