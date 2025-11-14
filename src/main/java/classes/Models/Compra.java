package classes.Models;
import java.util.Date;

public class Compra {
    private int idCompra;
    private Date dataHora;
    private Fornecedor fornecedor;

    public Compra() {}

    public Compra(int idCompra, Date dataHora, Fornecedor fornecedor) {
        this.idCompra = idCompra;
        this.dataHora = dataHora;
        this.fornecedor = fornecedor;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
