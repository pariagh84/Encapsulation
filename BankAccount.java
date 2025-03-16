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
        }
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        }
        if (amount > balance) {
            System.out.println("Not enough balance");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount);
    }

    //getters
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
