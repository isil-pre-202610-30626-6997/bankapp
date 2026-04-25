
// UpperCamelCase para los nombres de clases

// Los archivos de código fuente deben tener el mismo nombre que la clase que contienen

public class BankAccount {

    public int accountNumber;
    public double balance;

    public static double rate = 0.05;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        if (hasFunds(amount)) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void showDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public boolean hasFunds(double  amount){
        return balance >= amount;
    }

}
