public class SavingsAccount extends Account {
    @Override
    public void printExtract(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.printCommonInformation();
    }
}
