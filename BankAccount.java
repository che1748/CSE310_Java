   // extension used to get user inputs
import java.util.Date;

public class BankAccount {
    protected String _accountNumber;
    protected String _accountHolderName;
    protected Date _accountCreationDate;
    protected Double _balance;



    public BankAccount(String accountNumber, String accountHolderName, double initialDeposit)
    {
        _accountNumber = accountNumber;
        _balance = 0.;
    }

    public String getAccountNum()
    {
        return _accountNumber;
    }

    public String getHolderName()
    {
        return _accountHolderName;
    }

    public Date getDate()
    {
        return _accountCreationDate;
    }

    public double getBalance()
    {
        return _balance;
    }

    public void deposit(double amount)
    {
        if (amount < 0 )
        {
            System.out.println("Deposit amount must be positive");
        }
        _balance += amount;
    
    }

    public void withdraw(double amount)
    {
        if (amount < _balance && amount > 0)
        {
            throw new IllegalArgumentException("You do not have enough balance to withdraw from your account");
        }
        _balance -= amount;

    }  

    public void checkBalance()
    {
        System.out.println("Your balance is: $" + _balance);
    }
    
    public void displayAccountDetails()
    {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + _accountNumber);
        System.out.println("Account Holder: " + _accountHolderName);
        System.out.println("Balance: $" + _balance);
        System.out.println("Account Created On: " + _accountCreationDate);
    }
}

