void main() {

//    Produto produto = new Produto("Nome", 0.0, 0);
//    Produto produto1 = new Produto("Teclado Gamer", 199.0, 15);
//    produto.AdicionarProduto(produto1);
//
//    Produto produto2 = new Produto("Mouse leve", 500.0, 150);
//    produto.AdicionarProduto(produto2);
//
//    ProdutoPerecivel comida = new ProdutoPerecivel("Pizza", 50.0, 1, "23/07/2026");
//    produto.AdicionarProduto(comida);
//
//    produto.informeLista();
//    System.out.println(produto1.toString());
//    System.out.println(produto2.toString());
//    System.out.println(comida.toString());

    ArrayList<String> lista = new ArrayList<>();
    lista.add("Item 1");
    lista.add("Item 2");
    lista.add("Item 3");
    lista.add("Item 4");
    lista.add("Item 5");

    for (var items : lista){
        System.out.println(items);
    }

    Cachorro dog = new Cachorro();
    Animal animal = (Animal) dog;



}
