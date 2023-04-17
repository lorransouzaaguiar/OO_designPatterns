package Strategy;

public class Main {
    public static void main(String[] args) throws Exception {
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
