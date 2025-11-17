package classes;

public class Itens_Compra {

    private int id;
    private Compra compra;
    private Produto produto;
    private int quantidade;
    private ValorLote valorLote;

    public Itens_Compra() {
    }

    public Itens_Compra(int id, Compra compra, Produto produto, int quantidade, ValorLote valorLote) {
        this.id = id;
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorLote = valorLote;
    }

    public double getSubtotal() {
        if (valorLote != null) {
            return quantidade * valorLote.getValorLote();
        }
        return 0.0;
    }

    // Getters e Setters

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

    public ValorLote getValorLote() {
        return valorLote;
    }

    public void setValorLote(ValorLote valorLote) {
        this.valorLote = valorLote;
    }
}