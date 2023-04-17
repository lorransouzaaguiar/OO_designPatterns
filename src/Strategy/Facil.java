package Strategy;

public class Facil extends JogoStrategy {

    public Facil(Heroi heroi, Vilao vilao) {
        super(heroi, vilao, 2);
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

    @Override
    protected void vilaoAtaca() {
        System.out.println("Vilao ataca");
        int coeficienteDefesa = this.heroi.getDefesa() / this.coeficienteDeBatalha;
        int vidaAtual = this.heroi.getVidaAtual() + coeficienteDefesa
                - (this.vilao.getDano() * this.coeficienteDeBatalha);
        this.heroi.setVidaAtual(vidaAtual);
    }

    @Override
    protected void heroiAtaca() {
        System.out.println("Herói ataca");
        int vidaAtual = this.vilao.getVidaAtual() - (this.heroi.getDano() * this.coeficienteDeBatalha);
        this.vilao.setVidaAtual(vidaAtual);
    }

}
