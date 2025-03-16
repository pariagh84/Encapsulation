public class SavingsAccount extends BankAccount {

    private final double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest for " + getAccountHolderName() + " Savings Account: $" + interestRate * balance);
        this.deposit(interestRate * balance);
    }
}
