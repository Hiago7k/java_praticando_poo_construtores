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

    public void exibeLista(){
        for (ContaBancaria items  : lista){

            if (items.saldo > 10000)
            System.out.println("Numero da conta " +items.numeroDaConta + " Saldo " + items.saldo );
        }
    };
}
