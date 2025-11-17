package classes;

import java.time.LocalDateTime;

public class Comprovante {

    private int id;
    private LocalDateTime data;
    private Venda venda;

    // Construtores
    public Comprovante() {
    }

    public Comprovante(int id, LocalDateTime data, Venda venda) {
        this.id = id;
        this.data = data;
        this.venda = venda;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}