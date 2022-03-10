import static java.lang.System.out;
import Encomendas.LinhaEncomenda;

public class Main {
    public static void main(String[] args){
        LinhaEncomenda e = new LinhaEncomenda();

        e.setDesconto(10);
        e.setImposto(23);
        e.setPrecoAntesImposto(100);
        out.print(e.toString());
    }
}
