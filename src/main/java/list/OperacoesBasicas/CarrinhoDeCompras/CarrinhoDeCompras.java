package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Lista de itens no carrinho
    private List<Item> itens;

    // Construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    // Método para adicionar um item ao carrinho
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    // Método para remover um item do carrinho
    public void removerItem(Item item) {
        itens.remove(item);
    }

    // Método para obter o total do carrinho
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    // Método para listar os itens no carrinho
    public void listarItens() {
        for (Item item : itens) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }
}
