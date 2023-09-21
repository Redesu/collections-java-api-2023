package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!listaItem.isEmpty()) {
          for (Item i : listaItem) {
            if (i.getNome().equalsIgnoreCase(nome)) {
              itensParaRemover.add(i);
            }
          }
          listaItem.removeAll(itensParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!listaItem.isEmpty()){
            for (Item item: listaItem){

                double valorItem = item.getPreco() * item.getQntd();
                valorTotal += valorItem;
                
            }
            
        } else 
        System.out.println("A lista está vazia");
        return valorTotal;

    }

    public void exibitItens(){
        System.out.println(listaItem);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("tesoura", 2d, 5);
        carrinhoDeCompras.adicionarItem("apontador", 5d, 4);
        carrinhoDeCompras.adicionarItem("lapis", 2d, 5);
        carrinhoDeCompras.adicionarItem("borracha", 2d, 5);

        carrinhoDeCompras.exibitItens();

        carrinhoDeCompras.removerItem("lapis");

        carrinhoDeCompras.exibitItens();

        System.out.println("valor total: " + carrinhoDeCompras.calcularValorTotal());
        


        
    }

}
