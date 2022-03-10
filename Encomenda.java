import Encomendas.LinhaEncomenda;
import Encomendas.LinhaEncomenda.*;

import java.util.Arrays;

public class Encomenda {

    //Variáveis de Instância
    private String nomeCliente;
    private int nifCliente;
    private String moradaCliente;
    private String dataEncomenda;
    private String[] linhasEncomenda;

    public Encomenda(){
        this.nomeCliente = "";
        this.nifCliente = 0;
        this.moradaCliente = "";
        this.dataEncomenda = "";
        this.linhasEncomenda = new String[0];
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

    public String getDataEncomenda() {
        return dataEncomenda;
    }

    public String[] getLinhasEncomenda() {
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

    public void setDataEncomenda(String dataEncomenda) {
        this.dataEncomenda = dataEncomenda;
    }

    public void setLinhasEncomenda(String[] linhasEncomenda) {
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
        for (int i = 0; i < linhasEncomenda.length; i++){
            LinhaEncomenda l = (LinhaEncomenda) linhasEncomenda[i];
            l.calculaValorLinhaEnc();
        }
        return total;
    }
}


