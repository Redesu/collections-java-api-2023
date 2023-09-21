package main.java.generics.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long l, String nome, double preco, int qntd) {
        produtoSet.add(new Produto(l, nome, preco, qntd));
    }

    public Set<Produto> exibirProdutoPorNome() {

        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        return produtosPorNome;

    }

    public Set<Produto> exibirPorPreco() {

        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 1", 5d, 2);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 10d, 2);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 15d, 2);
        cadastroProdutos.adicionarProduto(4L, "Produto 4", 20d, 2);
        cadastroProdutos.adicionarProduto(5L, "Produto 5", 1d, 2);
        System.out.println(cadastroProdutos.exibirPorPreco());
     
    }

}
