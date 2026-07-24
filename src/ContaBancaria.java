import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    ArrayList<ContaBancaria> lista = new ArrayList<>();
    
    public void adicionarNaLista(ContaBancaria conta){
        lista.add(conta);
    }
}
