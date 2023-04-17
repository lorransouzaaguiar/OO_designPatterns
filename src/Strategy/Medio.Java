package Strategy;

public class Medio extends JogoStrategy {

    public Medio(Heroi heroi, Vilao vilao) {
        super(heroi, vilao, 4);
    }

    @Override
    public void jogar() {
        System.out.println("Jogando no Nível médio");
        while (true) {
            System.out.println("\n");
            this.exibirRodada(this.rodadas);
            this.heroiAtaca();
            this.vilaoAtaca();
            this.heroiAtaca();
            this.vilaoAtaca();

            if (this.jogoFinalizado()) {
                this.statusDoJogo();
                System.out.println("\n");
                break;
            }

            this.rodadas += 1;
        }

    }

}