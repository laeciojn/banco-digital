import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {
    Conta conta;

    private String nome;
    protected List<Conta> contas = new ArrayList<>();


    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        for (Conta conta : contas){
           conta.imprimirInformacoes();
        }
    }

}
