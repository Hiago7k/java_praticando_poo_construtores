void main() {

    Produto produto = new Produto("Nome", 0.0, 0);
    Produto produto1 = new Produto("Teclado Gamer", 199.0, 15);
    produto.AdicionarProduto(produto1);

    Produto produto2 = new Produto("Mouse leve", 500.0, 150);
    produto.AdicionarProduto(produto2);

    ProdutoPerecivel comida = new ProdutoPerecivel("Pizza", 50.0, 1, "23/07/2026");
    produto.AdicionarProduto(comida);

    produto.informeLista();
    System.out.println(produto1.toString());
    System.out.println(produto2.toString());
    System.out.println(comida.toString());

}
