import lombok.Data;

@Data
public abstract class Conta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        if (valor <= 0 || valor > saldo){
            System.out.println("Valor inválido. Gentileza, verifique o valor e tente novamente.");
        }else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso no valor de R$ " + valor);
        }
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido. Gentileza, verifique o valor e tente novamente.");
        }else{
            saldo += valor;
            System.out.println("Depósito realizado com sucesso no valor de R$ " + valor);
        }
    }

    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInformacoes(){
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
            System.out.println("");
    }
}
