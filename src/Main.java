
public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente();
        ana.setNome("Ana");
        ContaCorrente cc = new ContaCorrente(ana);
        cc.depositar(500);
        cc.imprimirExtrato();

        ContaPoupanca cp = new ContaPoupanca(ana);
        cp.depositar(5000);
        cp.imprimirExtrato();

        cc.transferir(cp, 100);
        cp.imprimirExtrato();
        cc.imprimirExtrato();

        System.out.println("------------------- Lista de contas para análise -------------------");
        Banco bc = new Banco();
        bc.adicionarConta(cc);
        bc.adicionarConta(cp);
        bc.listarContas();
    }
}