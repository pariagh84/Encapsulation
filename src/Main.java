public class Main {
    public static void main(String[] args) {
        //Create a bank
        BankCustomers bank = new BankCustomers();

        //Create three TransactionAccounts
        BankAccount transactionAccount1 = new TransactionAccount("4378921563", "Paria Gharakhani", 1000);
        BankAccount transactionAccount2 = new TransactionAccount("9263817405", "Anisa Zaiem", 1500);
        BankAccount transactionAccount3 = new TransactionAccount("5748291630", "Rozhin Jahanbakhsh", 2000);

        //Create three SavingsAccounts
        BankAccount savingsAccount1 = new SavingsAccount("3814759206", "Helia Khosravi", 5000);
        BankAccount savingsAccount2 = new SavingsAccount("6928473150", "Amin Asgari", 3000);
        BankAccount savingsAccount3 = new SavingsAccount("8471065923", "Sarira Tahmasebi", 2000);

        //Add accounts to the bank
        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);

        bank.addAccount(savingsAccount1);
        bank.addAccount(savingsAccount2);
        bank.addAccount(savingsAccount3);

        //Find an existing account and a non-existing one
        System.out.println("\nFinding an existing and non-existing account:");
        bank.findAccount("3814759206"); // Should be found
        bank.findAccount("5309827146"); // Should not be found

        //Print the initial balance of one account
        System.out.println("\nInitial Balance:");
        System.out.println(transactionAccount1.getBalance());
        System.out.println();

        //Deposit into that account and print updated balance
        System.out.println("\nDepositing into an existing account:");
        transactionAccount1.deposit(500);
        System.out.println("\nUpdated balance after deposit:");
        System.out.println(transactionAccount1.getBalance());


        //Add an incorrect deposit amount
        System.out.println("\nTesting incorrect deposit:");
        savingsAccount2.deposit(-200); // Invalid deposit

        //Calculate interest for Savings Accounts
        System.out.println("\nCalculating Interest for Savings account:");
        savingsAccount1.calculateInterest();
        System.out.println("\nBalance:");
        System.out.println(savingsAccount1.getBalance());
        System.out.println("\nCalculating interest for Transaction account:");
        transactionAccount3.calculateInterest();
        System.out.println("\nBalance:");
        System.out.println(transactionAccount3.getBalance());

        //Withdrawals: correct, incorrect, and exceeding balance from Transaction accounts
        System.out.println("\nPerforming Withdrawals:");
        transactionAccount1.withdraw(500); // Correct withdrawal
        transactionAccount2.withdraw(-100); // Invalid withdrawal
        transactionAccount3.withdraw(5000); // Exceeding balance
        System.out.println();

        //Withdrawals: correct, incorrect, and exceeding balance from Savings accounts
        savingsAccount1.withdraw(300); // Correct withdrawal
        savingsAccount2.withdraw(-450); // Invalid withdrawal
        savingsAccount3.withdraw(2500); // Exceeding balance

        //Final balances
        System.out.println("\nFinal Account Balances:");
        bank.showAllBalances();
    }
}
