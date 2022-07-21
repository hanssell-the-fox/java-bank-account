public class CheckingAccount extends Account {
    @Override
    public void printExtract(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.printCommonInformation();
    }
}
