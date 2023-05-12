package solidforbankmgmt.ocp.voilation;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        if (accountType.equalsIgnoreCase("Savings") || accountType.equalsIgnoreCase("Current")) {
            this.accountType = accountType; //taking account tpe
        } else {
            System.out.println("Invalid account make into savings");
            this.accountType = "Savings";
        }
    }

    public void deposit(double amount) {// //checking which account and accrding to that performing operations
        if (accountType.equalsIgnoreCase("Savings")) {
            balance += amount;
            balance += (0.05 * amount); // Adding interest because of saving account
        } else if (accountType.equalsIgnoreCase("Current")) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {        //checking which account and according to that performing operations
        if (accountType.equalsIgnoreCase("Savings")) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        } else if (accountType.equalsIgnoreCase("Current")) {
            if (balance >= amount) {
                balance -= amount;
            } else if ((balance + 5000) >= amount) { // Allow overdraft up to 5000 for current account additionaly you can take 500
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }
        //free aacount
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create a savings account
        BankAccount savingsAccount = new BankAccount("SA123456", "John Doe", 1000, "Savings");
        System.out.println("Initial balance of savings account: " + savingsAccount.getBalance());

        // Deposit some money into savings account
        savingsAccount.deposit(500);
        System.out.println("Balance of savings account after deposit: " + savingsAccount.getBalance());

        // Withdraw some money from savings account
        savingsAccount.withdraw(200);
        System.out.println("Balance of savings account after withdrawal: " + savingsAccount.getBalance());

        // Create a current account  within same bank aacount class
        BankAccount currentAccount = new BankAccount("X435865", "Somnath More", 2000, "Current");
        System.out.println("Initial balance of current account: " + currentAccount.getBalance());

        // Deposit some money into current account
        currentAccount.deposit(1000);
        System.out.println("Balance of current account after deposit: " + currentAccount.getBalance());

        // Withdraw some money from current account
        currentAccount.withdraw(3000);
        System.out.println("Balance of current account after withdrawal: " + currentAccount.getBalance());

        // Try to create an account with invalid account type
        BankAccount invalidAccount = new BankAccount("IA123456", "Invalid Account", 500, "Invalid");
            //do you have only two aacount what if i want to create third account
    }
}
