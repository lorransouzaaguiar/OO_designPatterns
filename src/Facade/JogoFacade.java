package Facade;

import Strategy.Dificil;
import Strategy.Heroi;
import Strategy.JogoCliente;
import Strategy.Medio;
import Strategy.Vilao;

public class JogoFacade {
    private Heroi heroi;
    private Vilao vilao;
    private JogoCliente jogo;

    JogoFacade() {
        this.heroi = new Heroi(90, 70, 10, "Herói");
        this.vilao = new Vilao(90, 70, 5, "Vilao");
        this.jogo = new JogoCliente(heroi, vilao);
    }

    public void jogarNoFacil() {
        jogo.jogar();
    }

    public void jogarNoMedio() {
        heroi.setDano(8);
        vilao.setDano(6);
        heroi.setVidaAtual(100);
        vilao.setVidaAtual(80);
        heroi.setDefesa(80);
        vilao.setDefesa(80);
        jogo.resetarJogo(new Medio(heroi, vilao));
        jogo.jogar();
    }

    public void jogarNoDificil() {
        heroi.setDano(8);
        vilao.setDano(7);
        heroi.setVidaAtual(90);
        vilao.setVidaAtual(100);
        heroi.setDefesa(55);
        vilao.setDefesa(85);
        jogo.resetarJogo(new Dificil(heroi, vilao));
        jogo.jogar();
    }

}
