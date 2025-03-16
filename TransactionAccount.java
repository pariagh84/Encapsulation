public class TransactionAccount extends BankAccount {

    private final double overDraftLimit = 500;

    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance) {
        super(accountHolderName, accountNumber, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Transaction Account does not have any interest");
    }

    @Override
    public void withdraw (double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        }
        if (amount > balance + overDraftLimit) {
            System.out.println("Cannot withdraw more than $" + overDraftLimit + " above $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount);
    }


}
