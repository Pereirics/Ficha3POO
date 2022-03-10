import java.util.Arrays;

public class Telemovel {

    // Variáveis de instância
    private String marca;
    private String modelo;
    private Double display; // resolução em X*Y
    private Double armazenamentoMensagensTexto;
    private Double armazenamentoFotosAplicacoes;
    private Double armazenamentoFotos;
    private Double armazenamentoAplicacoes;
    private Double armazenamentoTotalOcupado;
    private int numeroAplicacoes;
    private String[] nomeAplicacoes;

    /**
     * Construtores da classe Telemovel.
     * Declaração dos contrutores por omissão (vazio)
     */
    public Telemovel(){
        this.marca = "";
        this.modelo = "";
        this.display = 0.0;
        this.armazenamentoMensagensTexto = 0.0;
        this.armazenamentoFotosAplicacoes = 0.0;
        this.armazenamentoFotos = 0.0;
        this.armazenamentoAplicacoes = 0.0;
        this.armazenamentoTotalOcupado = 0.0;
        this.numeroAplicacoes = 0;
        this.nomeAplicacoes = new String[0];
    }

    /**
     *
     * @param numeroBytes numero de Bytes que o conteúdo ocupa;
     *
     * @return Se o telemóvel tem espaço para o conteúdo ser carregado para o telemóvel,
     */
    public boolean existeEspaco(int numeroBytes){
        return numeroBytes < this.armazenamentoTotalOcupado;
    }

    /**
     *
     * @param nome nome da aplicação a instalar
     * @param tamanho tamanho da aplicação a instalar
     */
    public void instalaApp(String nome, int tamanho){
        if (existeEspaco(tamanho)) {
            this.nomeAplicacoes = Arrays.copyOf(this.nomeAplicacoes, this.nomeAplicacoes.length + 1);
            this.nomeAplicacoes[this.nomeAplicacoes.length - 1] = nome;
            this.numeroAplicacoes += 1;
        }
    }

    public void recebeMsg(String msg){

    }


}
