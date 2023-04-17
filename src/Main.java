
import Strategy.Dificil;
import Strategy.Heroi;
import Strategy.JogoCliente;
import Strategy.Medio;
import Strategy.Vilao;
import TemplateMethod.SubClasseA;
import TemplateMethod.SubClasseB;

public class Main {

    public static void main(String[] args) throws Exception {
        SubClasseA subA = new SubClasseA();
        subA.templateMethod();

        SubClasseB subB = new SubClasseB();
        subB.templateMethod();

    }
}
