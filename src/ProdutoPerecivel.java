import java.util.Date;

public class ProdutoPerecivel extends  Produto {
    private Date dataValidade;
    
    public ProdutoPerecivel(String nome, double preco, int quantidade){
        super(nome, preco, quantidade);
    };
}
