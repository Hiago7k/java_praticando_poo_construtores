import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public void AdicionarProduto(Produto produto){
        listaDeProdutos.add(produto);
    }

    public void informeLista(){
        System.out.println("Tamanho da lista: "+ listaDeProdutos.size());
        System.out.println(" 01 da lista : "+ listaDeProdutos.get(0).getNome());
        System.out.println(" 01 da lista : "+ listaDeProdutos.get(1).getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "Detalhes da lista " + this.nome  + " " + this.preco + " " + this.quantidade;

    }
}
