public class Main {
    public static void main(String[] args) {
        Account ca = new CheckingAccount();
        Account sa = new SavingsAccount();

        ca.deposit(100);
        sa.transfer(100, ca);

        ca.printExtract();
        sa.printExtract();
    }
}
