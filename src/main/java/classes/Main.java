package classes;

import classes.ENUM.FormaPagamento;
import classes.ENUM.StatusPagamento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Vinícius")
        cliente1.setCpf("123.456.789-00");
        cliente1.setNome("João da Silva");
        cliente1.setCidade("São Paulo");
        cliente1.setRua("Rua das Flores");
        cliente1.setNumero(123);

        List<Produto> bancoDeProdutos = new ArrayList<>();
        bancoDeProdutos.add(new Produto(1, "Smartphone Samsung S23", 10, 3500.00, "128GB Preto"));
        bancoDeProdutos.add(new Produto(2, "Fone Bluetooth JBL", 5, 250.00, "Cancelamento de ruído"));
        bancoDeProdutos.add(new Produto(3, "Notebook Dell G15", 3, 5000.00, "i5, GTX 1650"));

        System.out.println("==============================================");
        System.out.println("           SISTEMA DE VENDAS ONLINE           ");
        System.out.println("==============================================")

        Venda vendaAtual = new Venda(1001, LocalDateTime.now(), cliente1);
        List<Itens_Venda> carrinhoDeCompras = new ArrayList<>();
        boolean continuarComprando = true;

        System.out.println("Bem-vindo, " + cliente1.getNome() + "!");

        while (continuarComprando) {
            System.out.println("\n--- PRODUTOS DISPONÍVEIS ---");
            for (Produto p : bancoDeProdutos) {
                System.out.printf("ID: %d | Modelo: %-20s | Preço: R$ %.2f | Estoque: %d%n", 
                        p.getId(), p.getModelo(), p.getPrecoUnit(), p.getEstoqueAtual());
            }

            System.out.print("\nDigite o ID do produto que deseja comprar: ");
            int idEscolhido = scanner.nextInt();

            Produto produtoSelecionado = null;
            for (Produto p : bancoDeProdutos) {
                if (p.getId() == idEscolhido) {
                    produtoSelecionado = p;
                    break;
                }
            }

            if (produtoSelecionado != null) {
                System.out.print("Digite a quantidade desejada: ");
                int qtdDesejada = scanner.nextInt();

                if (qtdDesejada > 0 && produtoSelecionado.getEstoqueAtual() >= qtdDesejada) {
                    Itens_Venda novoItem = new Itens_Venda(produtoSelecionado, qtdDesejada);
                    novoItem.setVenda(vendaAtual);
                    carrinhoDeCompras.add(novoItem);

                    produtoSelecionado.baixaEstoque(qtdDesejada);
                    System.out.println(">> Item adicionado ao carrinho com sucesso!");
                } else {
                    System.out.println(">> ERRO: Estoque insuficiente ou quantidade inválida.");
                }
            } else {
                System.out.println(">> ERRO: Produto não encontrado.");
            }

            System.out.print("\nDeseja adicionar mais itens? (1-Sim / 0-Não): ");
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                continuarComprando = false;
            }
        }

        if (carrinhoDeCompras.isEmpty()) {
            System.out.println("\nNenhum item comprado. Operação cancelada.");
            return;
        }

        System.out.println("\n---------------- RESUMO DA VENDA ----------------");
        vendaAtual.efetuarVendaProduto(carrinhoDeCompras); // Calcula totais

        for (Itens_Venda item : carrinhoDeCompras) {
            System.out.printf("Produto: %-20s | Qtd: %d | Subtotal: R$ %.2f%n",
                    item.getProduto().getModelo(),
                    item.getQuantidade(),
                    item.getSubtotal());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("TOTAL A PAGAR: R$ " + vendaAtual.getTotal());
        System.out.println("-------------------------------------------------");

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - PIX");
        System.out.println("2 - CARTÃO DE CRÉDITO");
        System.out.println("3 - CARTÃO DE DÉBITO");
        System.out.println("4 - DINHEIRO");
        System.out.print("Opção: ");
        int opPagamento = scanner.nextInt();

        FormaPagamento formaSelecionada;
        switch (opPagamento) {
            case 1: formaSelecionada = FormaPagamento.PIX; break;
            case 2: formaSelecionada = FormaPagamento.CREDITO; break;
            case 3: formaSelecionada = FormaPagamento.DEBITO; break;
            case 4: formaSelecionada = FormaPagamento.DINHEIRO; break;
            default: 
                formaSelecionada = FormaPagamento.DINHEIRO; 
                System.out.println("Opção inválida, selecionado Dinheiro por padrão.");
        }

        Pagamento pagamento = new Pagamento();
        pagamento.setId(500);
        pagamento.setDataHora(LocalDateTime.now());
        pagamento.setValorPag(vendaAtual.getTotal());
        pagamento.setVenda(vendaAtual);
        pagamento.setFormaPag(formaSelecionada);
        pagamento.setStatus(StatusPagamento.PAGO);

        System.out.println("\nProcessando pagamento via " + pagamento.getFormaPag() + "...");
        
        // Simulação de "loading"
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Status do Pagamento: " + pagamento.getStatus());

        if (pagamento.getStatus() == StatusPagamento.PAGO) {
            Comprovante comprovante = vendaAtual.emitirComprovante();

            System.out.println("\n==============================================");
            System.out.println("             COMPROVANTE DE VENDA             ");
            System.out.println("==============================================");
            System.out.println("ID: " + comprovante.getId());
            System.out.println("Data: " + comprovante.getData());
            System.out.println("Cliente: " + comprovante.getVenda().getCliente().getNome());
            System.out.println("CPF: " + comprovante.getVenda().getCliente().getCpf());
            System.out.println("Itens Comprados: " + carrinhoDeCompras.size());
            System.out.println("Valor Total: R$ " + comprovante.getVenda().getTotal());
            System.out.println("==============================================");
        }

        scanner.close();
    }
}