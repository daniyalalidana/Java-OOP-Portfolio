package Banking;
import java.util.ArrayList;
public class AccountManager<T extends BankAccount> {
    ArrayList<T> accounts = new ArrayList<>();
    void addAccount(T account)
    {
        accounts.add(account);
    }

    void findAccount(String accountNumber)
    {
        for (T account: accounts)
        {
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber))
            {
                                
                System.out.println("Found!");
                account.getAccountSummary();
            }
            else
            {
                System.out.println("Not found!");
            }
            

        }
    }
    
    double getTotalBalance()
    {
        double totalbalance = 0;
        for (T account : accounts)
        {
            totalbalance += account.getBalance();
        }
        return totalbalance;
    }

    void getAllAccounts()
    {
        for(T account :accounts)
        {
            account.getAccountType();
        }
        
    }
}
