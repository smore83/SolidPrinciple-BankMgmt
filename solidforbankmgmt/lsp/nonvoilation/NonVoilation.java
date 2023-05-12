package solidforbankmgmt.lsp.nonvoilation;

public  class NonVoilation {
    public static void main(String[] args) {
        BankAccount account1 = new SavingAccount(1000.0, 2.5);
        BankAccount account2 = new CheckingAccount(500.0, 100.0);

        System.out.println("Initial balances:");
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        // Deposit and withdraw from the accounts
        account1.deposit(500.0);
        account1.withdraw(100.0);
        account2.deposit(200.0);
        account2.withdraw(100.0);

        System.out.println("After transactions:");
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        SavingAccount savings = (SavingAccount) account1;
        savings.calculateInterest();

        CheckingAccount checking = (CheckingAccount) account2;
        checking.chargeFee();

        System.out.println("After interest and fee:");
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }

}

//AI
//MAN
//ROBOT