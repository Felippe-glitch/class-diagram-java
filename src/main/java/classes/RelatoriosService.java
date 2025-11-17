package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RelatoriosService {

    public List<Venda> relatorioVendaPorFuncionario(int idFuncionario, LocalDate dataInicio, LocalDate dataFim) {
        List<Venda> relatorio = new ArrayList<>();
        
        
        System.out.println("Gerando relatório de vendas para o funcionário ID: " + idFuncionario);
        return relatorio;
    }

    public List<Venda> relatorioVendaMensal(int ano, int mes) {
        List<Venda> relatorio = new ArrayList<>();
        
        System.out.println("Gerando relatório mensal: " + mes + "/" + ano);
        return relatorio;
    }

    public List<Produto> relatorioEstoque() {
        List<Produto> estoque = new ArrayList<>();
        
        System.out.println("Gerando relatório geral de estoque.");
        return estoque;
    }

    public List<Compra> relatorioCompras(LocalDate dataInicio, LocalDate dataFim, int idFornecedor) {
        List<Compra> historicoCompras = new ArrayList<>();
        
        
        System.out.println("Gerando relatório de compras do fornecedor ID: " + idFornecedor);
        return historicoCompras;
    }
}
