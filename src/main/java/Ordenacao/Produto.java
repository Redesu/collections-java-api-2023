package main.java.Ordenacao;

public class Produto implements Comparable<Produto> {
    
    private long codigo;
    private String nome;
    private double preco;
    private int qntd;
    public Produto(long codigo, String nome, double preco, int qntd) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }
    public long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQntd() {
        return qntd;
    }

    



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return codigo + ", " + nome + ", " + preco + ", "+ qntd + "]";
    }
    @Override
    public int compareTo(Produto p) {

        return nome.compareToIgnoreCase(p.getNome());
      

    }

    

}
