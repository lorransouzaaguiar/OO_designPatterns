package Strategy;

public class Dificil extends JogoStrategy {

    public Dificil(Heroi heroi, Vilao vilao) {
        super(heroi, vilao, 3);
    }

    @Override
    public void jogar() {
        System.out.println("Jogando no Nível difícil");
        while (true) {
            System.out.println("\n");
            this.exibirRodada(this.rodadas);
            this.vilaoAtaca();
            this.heroiAtaca();

            if (this.jogoFinalizado()) {
                this.statusDoJogo();
                System.out.println("\n");
                break;
            }

            this.rodadas += 1;
        }

    }

}
