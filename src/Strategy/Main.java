package Strategy;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Heroi heroi = new Heroi(90, 70, 10, "Herói");
        Vilao vilao = new Vilao(90, 70, 5, "Vilao");

        JogoCliente jogo = new JogoCliente(heroi, vilao);
        jogo.jogar();

        heroi.setDano(8);
        vilao.setDano(6);
        heroi.setVidaAtual(100);
        vilao.setVidaAtual(80);
        heroi.setDefesa(80);
        vilao.setDefesa(80);
        jogo.resetarJogo(new Medio(heroi, vilao));
        jogo.jogar();

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
