public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("------------------- Saldo bancário da Conta Poupança -------------------");
        super.imprimirInformacoes();
    }
}
