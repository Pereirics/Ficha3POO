import Encomendas.LinhaEncomenda;
import Encomendas.LinhaEncomenda.*;

import java.time.LocalDate;
import java.util.Arrays;

public class Encomenda {

    //Variáveis de Instância
    private String nomeCliente;
    private int nifCliente;
    private String moradaCliente;
    private LocalDate dataEncomenda;
    private LinhaEncomenda[] linhasEncomenda;

    public Encomenda(){
        this.nomeCliente = "";
        this.nifCliente = 0;
        this.moradaCliente = "";
        this.dataEncomenda = LocalDate.now();
        this.linhasEncomenda = new LinhaEncomenda[0];
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNifCliente() {
        return nifCliente;
    }

    public String getMoradaCliente() {
        return moradaCliente;
    }

    public LocalDate getDataEncomenda() {
        return dataEncomenda;
    }

    public LinhaEncomenda[] getLinhasEncomenda() {
        return linhasEncomenda;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNifCliente(int nifCliente) {
        this.nifCliente = nifCliente;
    }

    public void setMoradaCliente(String moradaCliente) {
        this.moradaCliente = moradaCliente;
    }

    public void setDataEncomenda(LocalDate dataEncomenda) {
        this.dataEncomenda = dataEncomenda;
    }

    public void setLinhasEncomenda(LinhaEncomenda[] linhasEncomenda) {
        this.linhasEncomenda = linhasEncomenda;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        Encomenda e = (Encomenda) o;
        return (this.nomeCliente == e.getNomeCliente() && this.nifCliente == e.getNifCliente() && this.moradaCliente == e.getMoradaCliente()
                && this.dataEncomenda == e.getDataEncomenda() && this.linhasEncomenda == e.getLinhasEncomenda()
        );
    }

    public String toString() {
        return "Encomenda{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", nifCliente=" + nifCliente +
                ", moradaCliente='" + moradaCliente + '\'' +
                ", dataEncomenda='" + dataEncomenda + '\'' +
                ", linhasEncomenda=" + Arrays.toString(linhasEncomenda) +
                '}';
    }

    public double calculaValorTotal(){
        double total = 0;
        for (LinhaEncomenda linhaEncomenda : linhasEncomenda) {
            total += linhaEncomenda.calculaValorLinhaEnc();
        }
        return total;
    }

    public double calculaValorDesconto(){
        double total = 0;
        for (LinhaEncomenda linhaEncomenda : linhasEncomenda){
            total += linhaEncomenda.calculaValorDesconto();
        }
        return total;
    }

    public int numeroTotalProdutos(){
        int total = 0;
        for(LinhaEncomenda linhaEncomenda : linhasEncomenda){
            total += linhaEncomenda.getQuantidadeEncomendada();
        }
        return total;
    }

    public boolean existeProdutoEncomenda(String refProduto){
        for (LinhaEncomenda linhaEncomenda : linhasEncomenda){
            if (linhaEncomenda.getReferenciaProduto().equals(refProduto)) return true;
        }
        return false;
    }

    public void adicionaLinha(LinhaEncomenda linha){
        linhasEncomenda = Arrays.copyOf(linhasEncomenda, linhasEncomenda.length + 1);
        linhasEncomenda[linhasEncomenda.length - 1] = linha;
    }

    public void removeProduto(String codProd){
        LinhaEncomenda[] novo = new LinhaEncomenda[linhasEncomenda.length - 1];
        for (int i = 0; i < linhasEncomenda.length; i++){
            if (linhasEncomenda[i].getReferenciaProduto().equals(codProd)){
                System.arraycopy(linhasEncomenda, 0, novo, 0, i);
                System.arraycopy(linhasEncomenda, i + 1, novo, i, linhasEncomenda.length - (i + 1));
            }
        }
        linhasEncomenda = novo;
    }
}


