public class App {
    public static void main(String[] args) throws Exception {
        
        BankAccount.rate = 0.07;

        BankAccount bankAccount01 = new BankAccount(1001, 100);
        bankAccount01.showDetails();

        bankAccount01.withDraw(500);

        bankAccount01.deposit(400);
        bankAccount01.showDetails();

        BankAccount bankAccount02 = new BankAccount(1002);
        bankAccount02.showDetails();
    }
}
