public abstract class BankAccount {

    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + " into " + accountHolderName + "'s account.");
        System.out.println();
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Not enough balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn $" + amount);
    }

    //Getters
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
