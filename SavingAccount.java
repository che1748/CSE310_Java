class SavingAccount extends BankAccount{
    private double _interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double initialDeposit, double interestRate)
    {
        super(accountNumber, accountHolderName, initialDeposit);
        _interestRate = interestRate;
    }

    public void addInterest()
    {
        double interest = _balance * _interestRate/100;
        deposit(interest);
    }

    @Override
    public void displayAccountDetails()
    {
        super.displayAccountDetails();
        System.out.println("Interst Rate: " + _interestRate + "%");
    }
}

