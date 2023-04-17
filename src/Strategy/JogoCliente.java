package Strategy;

public class JogoCliente {

    private JogoStrategy strategy = null;

    public JogoCliente(Heroi heroi, Vilao vilao) {
        if (this.strategy == null) {
            this.strategy = new Facil(heroi, vilao);
        }
    }

    public void resetarJogo(JogoStrategy jogoStrategy) {
        this.strategy = jogoStrategy;
    }

    public void jogar() {
        this.strategy.jogar();
    }

}
