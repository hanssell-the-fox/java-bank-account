public abstract class Account {
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;
    protected int agency;
    protected int number;
    protected double balance;

    public Account() {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
    }
    public void withdraw(double value){
        this.balance -= value;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void transfer(double value, Account target){
        this.withdraw(value);
        target.deposit(value);
    }

    protected void printCommonInformation() {
        System.out.printf("Agencia %d%n", this.agency);
        System.out.printf("Número %d%n", this.number);
        System.out.printf("Saldo %.2f%n", this.balance);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void printExtract(){}
}
