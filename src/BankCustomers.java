import java.util.ArrayList;

public class BankCustomers {

    private ArrayList<BankAccount> accountsList = new ArrayList<>();


    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println(account.getAccountHolderName());
            System.out.println(account.getAccountNumber());
            System.out.println(account.getBalance());
            System.out.println();
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println(account.getAccountHolderName());
                System.out.println(account.getAccountNumber());
                System.out.println(account.getBalance());
                System.out.println();
                return account;
            }
        }
        System.out.println("No such account exists!");
        return null;
    }
}
