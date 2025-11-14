package classes.Models;

public class Produto {
    private int id;
    private String modelo;
    private int quantidade;
    private double precoUnit;
    private String descricao;

    public Produto() {}

    public Produto(int id, String modelo, int quantidade, double precoUnit, String descricao){
        this.id = id;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.precoUnit = precoUnit;
        this.descricao = descricao;
    }

    public int getId(){
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

    public int getQuantidade() {
        return quantidade;
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
