package Strategy;

public class JogoCliente {

    private JogoStrategy strategy;

    public JogoCliente(Heroi heroi, Vilao vilao) {
        this.strategy = new Facil(heroi, vilao);
    }

    public void resetarJogo(JogoStrategy jogoStrategy) {
        this.strategy = jogoStrategy;
    }

    public void jogar() {
        this.strategy.jogar();
    }

}
