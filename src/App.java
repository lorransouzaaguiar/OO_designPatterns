import Strategy.Dificil;
import Strategy.JogoCliente;
import TemplateMethod.SubClasseA;
import TemplateMethod.SubClasseB;

public class App {

    public static void rodaTemplateMethod(String[] args) throws Exception {
        SubClasseA subA = new SubClasseA();
        subA.templateMethod();

        SubClasseB subB = new SubClasseB();
        subB.templateMethod();
    }

    public static void rodaStrategy(String[] args) throws Exception {
        JogoCliente jogo = new JogoCliente();
        jogo.jogar();

        jogo.mudarDificuldade(new Dificil());
        jogo.jogar();
    }
}
