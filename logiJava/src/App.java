import br.com.logi.model.Armazem;
import br.com.logi.model.TelaArmazem;

public class App {
    public static void main(String[] args) throws Exception {
        Armazem armazem = new Armazem(4, 4);
        //armazem.mostrarSetores();
        new TelaArmazem(armazem);

    }

}
