package Strategy;

public class Facil extends JogoStrategy {

    Facil(Heroi heroi, Vilao vilao) {
        super(heroi, vilao, 2);
    }

    @Override
    public void jogar() {
        System.out.println("Jogando no Nível fácil");
        while (true) {
            this.exibirRodada(this.rodadas);
            this.heroiAtaca();
            this.heroiAtaca();
            this.vilaoAtaca();
            this.heroiAtaca();

            this.rodadas += 1;

            if (this.jogoFinalizado()) {
                this.statusDoJogo();
                break;
            }
        }

    }

    @Override
    protected void vilaoAtaca() {
        System.out.println("Vilao atacando");
        int coeficienteDefesa = this.heroi.getDefesa() / this.coeficienteDeBatalha;
        int vidaAtual = this.heroi.getVidaAtual() + coeficienteDefesa
                - (this.vilao.getDano() * this.coeficienteDeBatalha);
        this.heroi.setVidaAtual(vidaAtual);
    }

    @Override
    protected void heroiAtaca() {
        System.out.println("Herói atacando");
        int vidaAtual = this.vilao.getVidaAtual() - (this.heroi.getDano() * this.coeficienteDeBatalha);
        this.vilao.setVidaAtual(vidaAtual);
    }

}
