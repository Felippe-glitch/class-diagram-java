package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private int idCompra;
    private LocalDateTime dataHora;
    private Fornecedor fornecedor; 
    
    private List<Itens_Compra> itensCompra;

    public Compra() {
        this.itensCompra = new ArrayList<>();
    }

    public Compra(int idCompra, LocalDateTime dataHora, Fornecedor fornecedor) {
        this.idCompra = idCompra;
        this.dataHora = dataHora;
        this.fornecedor = fornecedor;
        this.itensCompra = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        Itens_Compra novoItem = new Itens_Compra();
        novoItem.setProduto(produto);
        novoItem.setQuantidade(quantidade);
        novoItem.setCompra(this);
        
        this.itensCompra.add(novoItem);
        System.out.println("Produto " + produto.getModelo() + " adicionado à compra.");
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Itens_Compra item : itensCompra) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void finalizarCompra() {
        for (Itens_Compra item : itensCompra) {
            if (item.getProduto() != null) {
                item.getProduto().adicionarEstoque(item.getQuantidade());
            }
        }
        System.out.println("Compra finalizada e estoque atualizado.");
    }

    // --- Getters e Setters ---

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Itens_Compra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<Itens_Compra> itensCompra) {
        this.itensCompra = itensCompra;
    }
}
