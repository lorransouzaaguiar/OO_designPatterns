package Strategy;

public class Facil extends JogoStrategy {

    public Facil(Heroi heroi, Vilao vilao) {
        super(heroi, vilao, 9);
    }

    @Override
    public void jogar() {
        System.out.println("Jogando no Nível fácil");
        while (true) {
            System.out.println("\n");
            this.exibirRodada(this.rodadas);
            this.heroiAtaca();
            this.heroiAtaca();
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
