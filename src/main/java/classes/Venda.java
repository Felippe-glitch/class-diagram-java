package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private int id;
    private LocalDateTime dataHora;
    private Cliente cliente;
    private double total; 
    
    public Venda() {
        new ArrayList<>();
    }

    public Venda(int id, LocalDateTime dataHora, Cliente cliente) {
        this.id = id;
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.total = 0.0;
    }

    // --- Métodos do Diagrama ---

    public Comprovante emitirComprovante() {
        Comprovante comprovante = new Comprovante();
        comprovante.setData(LocalDateTime.now());
        comprovante.setVenda(this);
        return comprovante;
    }

    public void efetuarVendaProduto(List<Itens_Venda> itens) {
        this.total = calcularTotal();
        System.out.println("Venda efetuada com sucesso.");
    }

    public void adicionarItem(Produto produto, int qtd) {
        this.total = calcularTotal();
    }

    public List<Venda> getHistoricoVendas(LocalDate dataInicio, LocalDate dataFim) {
        List<Venda> historico = new ArrayList<>();
        return historico;
    }

    private double calcularTotal() {
        double soma = 0.0;
        return soma;
    }

    // --- Getters e Setters ---

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
