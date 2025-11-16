package Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    final String bankName = "DAD bank of Balghar";
    List<Customer> customers;
    AccountManager<BankAccount> accountmanger;

    public Bank() {
    this.customers = new ArrayList<>();
    this.accountmanger = new AccountManager<>();
    }
    void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public void openAccount(Customer customer, BankAccount account)
    {
        customer.addAccount(account);
        accountmanger.addAccount(account);
    }

    void findCustomer(int customerId)
    {
        for(Customer customer : customers)
        {
            if ( customer.getCustomerId() == customerId )
            {
                customer.getCustomerInfo();
            }
        }
    }

    void getBankSummary() 
    {
         double totalbalance = 0;
         int totalCustomers = customers.size();
        for (Customer customer: customers)
        {
            totalbalance += customer.getTotalBalance();
        }

        System.out.println("Total Customer in Bank: "+ totalCustomers);
        System.out.println("Total Balance in Bank: "+ totalbalance);
    }

}
