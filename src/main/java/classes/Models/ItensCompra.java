package classes.Models;

public class ItensCompra {
    private int id;
    private Compra compra;
    private Produto produto;
    private int quantidade;
    private Lote Lote;

    public ItensCompra() {}

    public ItensCompra(int id, Compra compra, Produto produto, int quantidade, Lote lote) {
        this.id = id;
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.Lote = lote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Lote getLote() {
        return Lote;
    }

    public void setLote(Lote lote) {
        Lote = lote;
    }

    
}
