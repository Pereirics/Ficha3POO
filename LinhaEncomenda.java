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

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double calculaValorLinhaEnc(){
        return (getPrecoAntesImposto() - (getPrecoAntesImposto()* getDesconto() / 100)) + ((getPrecoAntesImposto() - (getPrecoAntesImposto()* getDesconto() / 100)) * getImposto() / 100);
    }

    public double calculaValorDesconto(){
        return
    }
}
