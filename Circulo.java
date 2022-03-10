public class Circulo {

    // Variáveis de instância
    private double x;
    private double y;
    private double raio;

    /**
     * Construtores da classe Circulo.
     * Declaração dos construtores por omissão (vazio).
     */
    public Circulo(){
        this.x = this.y = 0;
        this.raio = 0;
    }

    /**
     * Construtor parametrizado
     */
    public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this.setRaio(raio); //Garante que o raio é positivo, ver setRaio
    }

    /**
     * Construtor de cópia
     */
    public Circulo(Circulo c){
        this.x = c.getX();
        this.y = c.getY();
        this.raio = c.getRaio();
    }

    /**
     * Devolve o valor da coordenada em x.
     *
     * @return valor da coordenada x.
     */
    public double getX(){
        return x;
    }

    /**
     * Devolve o valor da coordenada em y.
     *
     * @return valor da coordenada em y.
     */

    public double getY(){
        return y;
    }

    /**
     * Devolve o valor do raio.
     * @return valor do raio.
     */

    public double getRaio(){
        return raio;
    }

    /**
     * Atualiza o valor da coordenada em x.
     *
     *  @param x novo valor da coordenada x.
     */

    public void setX(double x){
        this.x = x;
    }

    /**
     * Atualiza o valor da coordenada em y.
     *
     * @param y novo valor da coordenada em y.
     */

    public void setY(double y){
        this.y = y;
    }

    /**
     * Atualiza o valor do raio.
     *
     * @param raio novo valor do raio.
     */
    public void setRaio(double raio){
        this.raio = Math.abs(raio);
    }

    /**
     * Atualiza o valor da coordenada em x e y ao mesmo tempo.
     *
     * @param x novo valor da coordenada em x.
     * @param y novo valor da coordenada em y.
     */

    public void alteraCentro(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Calcula a área de um círculo.
     *
     * @return valor da área do círculo.
     */
    public double calculaArea(){
        return Math.PI * raio * raio;
    }

    /**
     * Calcula o perímetro de um círculo.
     *
     * @return valor do perímetro do círculo.
     */

    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        Circulo c = (Circulo) o;
        return this.raio == c.getRaio(); //poderia adicionar a comparação das posições de x e y
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Circulo(x:");
        sb.append("x: ").append(this.x).append(",y: ").append(this.y).append(",raio: ").append(this.raio).append(")");
        return sb.toString();
    }
}
