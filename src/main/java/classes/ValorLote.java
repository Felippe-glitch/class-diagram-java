package classes;

import java.time.LocalDate;

public class ValorLote {
    private int id;
    private LocalDate dataLote;
    private double valorLote;

    public ValorLote() {
    }

    public ValorLote(int id, LocalDate dataLote, double valorLote) {
        this.id = id;
        this.dataLote = dataLote;
        this.valorLote = valorLote;
    }

    public double getValorLote() {
        return valorLote;
    }

    public void setValorLote(double valorLote) {
        this.valorLote = valorLote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataLote() {
        return dataLote;
    }

    public void setDataLote(LocalDate dataLote) {
        this.dataLote = dataLote;
    }
}
