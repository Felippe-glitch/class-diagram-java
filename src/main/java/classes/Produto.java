package classes;

public class Produto {

    private int id;
    private String modelo;
    private int quantidade;
    private double precoUnit;
    private String descricao;
    // Construtores
    public Produto() {
    }

    public Produto(int id, String modelo, int quantidade, double precoUnit, String descricao) {
        this.id = id;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.precoUnit = precoUnit;
        this.descricao = descricao;
    }

    // --- Métodos do Diagrama ---

    public void baixaEstoque(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Baixa de estoque realizada. Novo saldo: " + this.quantidade);
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
        System.out.println("Estoque adicionado. Novo saldo: " + this.quantidade);
    }

    public int getEstoqueAtual() {
        return this.quantidade;
    }

    // --- Getters e Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}