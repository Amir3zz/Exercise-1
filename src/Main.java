public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("4937503927", "Camila", 2500000);
        account.getAccountInfo();
        account.checkBalance();
        account.deposit(54839);
        account.withdraw(92045);
        account.checkBalance();

        SavingsAccount savingsAccount = new SavingsAccount("4937503927", "Camila", 19475000, 0.02);
        savingsAccount.checkBalance();
        savingsAccount.applyInterest();
        savingsAccount.checkBalance();
    }
}
