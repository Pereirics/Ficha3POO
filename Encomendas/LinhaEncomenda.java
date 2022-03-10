package Encomendas;

public class LinhaEncomenda {

    //Variáveis de instância
    private String referenciaProduto;
    private String descricaoProduto;
    private double precoAntesImposto;
    private int quantidadeEncomendada;
    private double imposto;
    private double desconto;

    public LinhaEncomenda(){
        this.referenciaProduto = "";
        this.descricaoProduto = "";
        this.precoAntesImposto = 0;
        this.quantidadeEncomendada = 0;
        this.imposto = 0;
        this.desconto = 0;
    }

    public String getReferenciaProduto(){
        return referenciaProduto;
    }

    public String getDescricaoProduto(){
        return descricaoProduto;
    }

    public double getPrecoAntesImposto(){
        return precoAntesImposto;
    }

    public int getQuantidadeEncomendada(){
        return quantidadeEncomendada;
    }

    public double getImposto(){
        return imposto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setReferenciaProduto(String referenciaProduto){
        this.referenciaProduto = referenciaProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setPrecoAntesImposto(double precoAntesImposto) {
        this.precoAntesImposto = precoAntesImposto;
    }

    public void setQuantidadeEncomendada(int quantidadeEncomendada) {
        this.quantidadeEncomendada = quantidadeEncomendada;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setImposto(double imposto){ this.imposto = imposto; }

    public boolean equals(Object o){
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        LinhaEncomenda e = (LinhaEncomenda) o;
        return (
                this.referenciaProduto == e.getReferenciaProduto() && this.descricaoProduto == e.getDescricaoProduto()
                && this.desconto == e.getDesconto() && this.imposto == e.getImposto() && this.precoAntesImposto == e.getPrecoAntesImposto()
                && this. quantidadeEncomendada == e.getQuantidadeEncomendada()
        );
    }

    public String toString(){
        String sb = "Linha Encomenda: (Referência do Produto: " + this.referenciaProduto + ", Descrição do Produto: " + this.descricaoProduto + ", Preço antes Imposto: " +
                this.precoAntesImposto + ", Quantidade Encomendada: " + this.quantidadeEncomendada + ", Imposto: " +
                this.imposto + ", Desconto: " + this.desconto;
        return sb;
    }

    public double calculaValorLinhaEnc(){
        return (getPrecoAntesImposto() - (getPrecoAntesImposto() * getDesconto() / 100)) + ((getPrecoAntesImposto() - (getPrecoAntesImposto() * getDesconto() / 100)) * getImposto() / 100);
    }

    public double calculaValorDesconto(){
        return (getPrecoAntesImposto() * getDesconto() / 100);
    }
}
