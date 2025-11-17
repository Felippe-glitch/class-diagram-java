package classes;

public class Itens_Venda {

    private int id;
    private int quantidade; 
    private Venda venda;
    private Produto produto;

    public Itens_Venda() {
    }

    public Itens_Venda(int id, int quantidade, Venda venda, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.venda = venda;
        this.produto = produto;
    }
    
    public Itens_Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        if (produto != null) {
            return produto.getPrecoUnit() * this.quantidade;
        }
        return 0.0;
    }

    // --- Getters e Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
