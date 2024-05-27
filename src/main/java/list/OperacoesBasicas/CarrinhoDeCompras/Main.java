package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        // Criação de itens
        Item item1 = new Item("Maçã", 0.50, 10);
        Item item2 = new Item("Banana", 0.30, 5);

        // Criação do carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        // Listando itens no carrinho
        carrinho.listarItens();

        // Calculando o total do carrinho
        double total = carrinho.calcularTotal();
        System.out.println("Total: " + total);

        // Modificando um item
        item1.setPreco(0.45);
        item2.setQuantidade(7);

        // Listando itens novamente
        carrinho.listarItens();
        total = carrinho.calcularTotal();
        System.out.println("Total atualizado: " + total);
    }
}
