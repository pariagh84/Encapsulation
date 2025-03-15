public class TransactionAccount extends BankAccount {

    private final double overDraftLimit();

    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance) {
        super(accountHolderName, accountNumber, initialBalance);
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void withdraw (double amount) {

    }


}
