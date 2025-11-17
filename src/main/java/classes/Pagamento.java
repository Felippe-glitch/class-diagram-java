package classes;

import java.time.LocalDateTime;

import classes.ENUM.FormaPagamento;
import classes.ENUM.StatusPagamento;

public class Pagamento {

    private int id;
    private LocalDateTime dataHora;
    private FormaPagamento formaPag; 
    private double valorPag;
    private Venda venda;             
    private StatusPagamento status;  

    public Pagamento() {
    }

    public Pagamento(int id, LocalDateTime dataHora, FormaPagamento formaPag, 
                     double valorPag, Venda venda, StatusPagamento status) {
        this.id = id;
        this.dataHora = dataHora;
        this.formaPag = formaPag;
        this.valorPag = valorPag;
        this.venda = venda;
        this.status = status;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public FormaPagamento getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(FormaPagamento formaPag) {
        this.formaPag = formaPag;
    }

    public double getValorPag() {
        return valorPag;
    }

    public void setValorPag(double valorPag) {
        this.valorPag = valorPag;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }
}
