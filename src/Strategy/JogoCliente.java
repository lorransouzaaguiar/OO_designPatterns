package Strategy;

public class JogoCliente {

    private JogoStrategy strategy = null;

    public JogoCliente() {
        if (this.strategy == null) {
            Heroi heroi = new Heroi(100, 90, 10, "heroi");
            Vilao vilao = new Vilao(90, 75, 8, "Vilão");
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
