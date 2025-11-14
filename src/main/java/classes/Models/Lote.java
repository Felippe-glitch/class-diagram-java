package classes.Models;

import java.util.Date;

public class Lote {
    private int id;
    private Date dataLote;
    private double valorLote;

    public Lote() {}

    public Lote(int id, Date dataLote, double valorLote){
        this.id = id;
        this.dataLote = dataLote;
        this.valorLote = valorLote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataLote() {
        return dataLote;
    }

    public void setDataLote(Date dataLote) {
        this.dataLote = dataLote;
    }

    public double getValorLote() {
        return valorLote;
    }

    public void setValorLote(double valorLote) {
        this.valorLote = valorLote;
    }

    
}
