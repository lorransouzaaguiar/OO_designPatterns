
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

        System.out.println("\n");

        Heroi heroi = new Heroi(90, 70, 10, "Herói");
        Vilao vilao = new Vilao(90, 70, 5, "Vilao");

        JogoCliente jogo = new JogoCliente(heroi, vilao);
        jogo.jogar();

        jogo.resetarJogo(new Medio(heroi, vilao));
        jogo.jogar();

        jogo.resetarJogo(new Dificil(heroi, vilao));
        jogo.jogar();

    }
}
