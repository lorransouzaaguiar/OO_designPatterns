package TemplateMethod;

import Strategy.Heroi;
import Strategy.JogoCliente;
import Strategy.Medio;
import Strategy.Vilao;

public class Main {

    public static void main(String[] args) throws Exception {
        SubClasseA subA = new SubClasseA();
        subA.templateMethod();

        SubClasseB subB = new SubClasseB();
        subB.templateMethod();

        System.out.println("\n");

        JogoCliente jogo = new JogoCliente();
        jogo.jogar();

        System.out.println("\n");

        Heroi heroi = new Heroi(90, 70, 26, "Herói");
        Vilao vilao = new Vilao(90, 70, 22, "Vilao");

        jogo.resetarJogo(new Medio(heroi, vilao));
        jogo.jogar();

    }
}
