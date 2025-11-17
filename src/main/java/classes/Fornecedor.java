package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoa {

    public Fornecedor() {
        super();
    }

    public Fornecedor(String nome, String email, String senha) {
        super(0, nome, email, senha); 
    }

    public List<Compra> relatorioHistoricoCompras(LocalDate dataInicio, LocalDate dataFim) {
        List<Compra> listaDeCompras = new ArrayList<>();
        
        System.out.println("Gerando relatório de compras do fornecedor: " + getNome());
        System.out.println("Período: " + dataInicio + " até " + dataFim);

        return listaDeCompras;
    }
}