package Strategy;

public class JogoCliente {

    private Strategy strategy;

    public JogoCliente() {
        this.strategy = new Facil();
    }

    public void mudarDificuldade(Strategy st) {
        this.strategy = st;
    }

    public void jogar() {
        this.strategy.jogar();
    }

}
