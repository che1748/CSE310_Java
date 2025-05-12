import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> _accounts = new ArrayList<>();;

    public BankAccount getAccount(String accountNumber)
    {
        for (BankAccount account : _accounts)
        {
            if (account.getAccountNum().equals(accountNumber))
            {return account;}
        }

        return null;
    }

    public boolean addAcount( BankAccount account)
    {
        if (getAccount(account.getAccountNum()) != null)
        {
            System.out.println("Account already exists");
            return false;
        }
        _accounts.add(account);
        System.out.println("Account added successfully");
        return true;
    }

    public boolean removeAccount(String accountNumber)
    {
        BankAccount account = getAccount(accountNumber);
        if (account != null)
        {
            _accounts.remove(account);
            System.out.println("Account removed");
            return true;
        }
        System.out.println("Account not found");
        return false;
    }

}
