void main() {

    Produto produto = new Produto();
    Produto produto1 = new Produto();
    produto1.setNome("Teclado Gamer");
    produto1.setPreco(199.0);
    produto1.setQuantidade(15);

    produto.AdicionarProduto(produto1);

    Produto produto2 = new Produto();
    produto2.setNome("Mouse leve");
    produto2.setPreco(500.0);
    produto2.setQuantidade(150);
    produto.AdicionarProduto(produto2);


    produto.informeLista();

}
