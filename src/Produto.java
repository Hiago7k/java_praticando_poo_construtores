import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void AdicionarProduto(Produto produto){
        produto.add(listaDeProdutos);
    }
    
}
