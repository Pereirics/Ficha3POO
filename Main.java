import static java.lang.System.out;
import Encomendas.LinhaEncomenda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinhaEncomenda e = new LinhaEncomenda();
        Encomenda E = new Encomenda();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (true) {
            out.print("Quer criar uma nova encomenda? (S/N)");
            String encomenda = sc.nextLine();
            switch (encomenda) {
                case ("S"):
                    out.print("Insira o nome do cliente: (String)");
                    E.setNomeCliente(sc.nextLine());
                    out.print("Insira o NIF do cliente: (Int)");
                    E.setNifCliente(sc.nextInt());
                    out.print("Insira a morada do cliente: (String)");
                    E.setMoradaCliente(sc.nextLine());
                    out.print("Insira a data da encomenda: (String)");
                    E.setDataEncomenda(sc.nextLine());

                    out.print("Quer adicionar uma nova linha de encomenda? (S/N): ");
                    String linha_encomenda = sc.nextLine();
                    if ("S".equals(linha_encomenda)) {
                        out.print("Insira a referência do produto: (String)");
                        e.setReferenciaProduto(sc.nextLine());
                        out.print("Insira a descrição do produto: (String)");
                        e.setDescricaoProduto(sc.nextLine());
                        out.print("Insira o preço antes do imposto: (Double)");
                        e.setPrecoAntesImposto(sc.nextDouble());
                        out.print("Insira a quantidade encomendada: (Int)");
                        e.setQuantidadeEncomendada(sc.nextInt());
                        out.print("Insira o imposto: (Double)");
                        e.setImposto(sc.nextDouble());
                        out.print("Insira o desconto: (Double)");
                        e.setDesconto(sc.nextDouble());

                        E.adicionaLinha(e);
                        break;
                    }
                case ("N"):
                    while (true) {
                        out.print("\n");
                        out.print("""
                                Escolha uma das seguintes opções:\s
                                    ver dados da encomenda -> (1)
                                    alterar informações da encomenda:
                                        nome cliente (2)
                                        nif  cliente (3)
                                        morada cliente (4)
                                        data encomenda (5)
                                    operações extra:
                                        calcular valor total da encomenda (6)
                                        calcular valor desconto no total da encomenda (7)
                                        calcular numero total de produtos (8)
                                        verificar se existe um produto na encomenda (9)
                                        remover linha encomenda (10)
                                        adicionar linha encomenda (11)
                                    reset a encomenda (12)
                                    sair -> (13)
                                \s""");
                        int escolha = sc.nextInt();
                        switch (escolha) {
                            case 1:
                                out.print(E.toString());
                                break;
                            case 2:
                                out.print("Insira o novo nome do cliente: (String)");
                                E.setNomeCliente(sc.nextLine());
                                break;
                            case 3:
                                out.print("Insira o novo NIF do cliente: (Int)");
                                E.setNifCliente(sc.nextInt());
                                break;
                            case 4:
                                out.print("Insira a nova morada do cliente: (String)");
                                E.setMoradaCliente(sc.nextLine());
                                break;
                            case 5:
                                out.print("Insira a nova data da encomeda: (String)");
                                E.setDataEncomenda(sc.nextLine());
                                break;
                            case 6:
                                out.print(E.calculaValorTotal());
                                break;
                            case 7:
                                out.print(E.calculaValorDesconto());
                                break;
                            case 8:
                                out.print(E.numeroTotalProdutos());
                                break;
                            case 9:
                                out.print("Insira a referência do produto que pretende verificar se existe: (String)");
                                out.print(E.existeProdutoEncomenda(sc.nextLine()));
                                break;
                            case 10:
                                out.print("Insira a referência do produto que pretende remover: (String)");
                                E.removeProduto(sc.nextLine());
                                break;
                            case 11:
                                out.print("Insira a referência do produto: (String)");
                                e.setReferenciaProduto(sc.nextLine());
                                out.print("Insira a descrição do produto: (String)");
                                e.setDescricaoProduto(sc.nextLine());
                                out.print("Insira o preço antes do imposto: (Double)");
                                e.setPrecoAntesImposto(sc.nextDouble());
                                out.print("Insira a quantidade encomendada: (Int)");
                                e.setQuantidadeEncomendada(sc.nextInt());
                                out.print("Insira o imposto: (Double)");
                                e.setImposto(sc.nextDouble());
                                out.print("Insira o desconto: (Double)");
                                e.setDesconto(sc.nextDouble());

                                E.adicionaLinha(e);
                                break;
                            case 12:
                                flag = false;
                                break;
                            case 13:
                                System.exit(0);
                        }
                    }
            }
        }
    }
}
