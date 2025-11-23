public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("9876543210", 10000);
        acc.deposit(2500);
        acc.withdraw(4000);
        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Final Balance: ₹" + acc.getBalance());
    }
}
