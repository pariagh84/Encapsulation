public class SavingsAccount extends BankAccount {

    private final double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        deposit(interestRate * getBalance());
        System.out.println("Interest is " + interestRate * getBalance() + " for Savings Account.");
    }
}
