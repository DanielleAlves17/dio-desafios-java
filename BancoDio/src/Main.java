public class Main {
    public static void main(String[] args) {
        Cliente danielle = new Cliente();
        danielle.setNome("Danielle");

        Conta cc = new ContaCorrente(danielle);
        Conta poupanca = new ContaPoupanca(danielle);

        cc.depositar(1000);
        cc.transferir(500,poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}